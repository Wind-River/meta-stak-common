DESCRIPTION = "A Puppet module to map files to resources and back."

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b43880e14353cbc12cf3981fb93a0944"

PV = "1.1.3"
SRCREV = "9b53310278e76827bbe12a36cc6470d77071abb2"
PROTOCOL = "https"
BRANCH = "master"
S = "${WORKDIR}/git"

SRC_URI = " \
	git://github.com/adrienthebo/puppet-filemapper;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH} \
	file://${PN}/Add-gemspec.patch \
	file://${PN}/metadata.json.patch \
	" 

inherit ruby 

DEPENDS += " \
	ruby \
	facter \
	"

RDEPENDS_${PN} += " \
	ruby \
	facter \
	puppet \
	"

RUBY_BUILD_GEMS = "adrien-filemapper.gemspec"
RUBY_INSTALL_GEMS = "adrien-filemapper-${PV}.gem"

do_install_append() {
	install -d -m 0755 ${D}/${datadir}/puppet/modules/filemapper
	cp -R ${S}/* ${D}/${datadir}/puppet/modules/filemapper
}

FILES_${PN} += " ${datadir}"
