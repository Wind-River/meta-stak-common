SUMMARY = "Community Developed Ceph Module."

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e5ccf641e613489e66aa98271dbe798"

PV = "2.4.1"
SRC_REV = "ebea4b703d002d64d0b623cc51d42890b187ab97"
PROTOCOL = "https"
BRANCH = "stable/jewel"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/openstack/puppet-ceph.git;protocol=${PROTOCOL};rev=${SRC_REV};branch=${BRANCH} \
	file://puppet-ceph/Add-gemspec.patch \
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

RUBY_INSTALL_GEMS = "puppet-ceph-${PV}.gem"

do_install_append() {
	install -d -m 0755 ${D}/${datadir}/puppet/modules/ceph
	cp -r ${S}/* ${D}/${datadir}/puppet/modules/ceph
}

FILES_${PN} += " ${datadir}"
