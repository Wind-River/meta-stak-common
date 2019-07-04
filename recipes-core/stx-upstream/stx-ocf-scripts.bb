DESCRIPTION = "stx-ocf-scripts"

STABLE = "starlingx/master"
PROTOCOL = "https"
BRANCH = "master"
SRCREV = "70609a3d55e5b7d2be82667fc35792505f9013c4"
S = "${WORKDIR}/git"
PV = "19.05"

LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://opendev.org/starlingx/config.git;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH}"

require stx-upstream.inc


RDEPENDS_${PN}_append = " bash"

do_configure () {
	:
} 

do_compile() {
	:
}

do_install () {
	cd ${S}/openstack/stx-ocf-scripts/src/

	install -d ${D}/${libdir}/ocf/resource.d/openstack
	install -p -D -m 0755 ocf/* ${D}/${libdir}/ocf/resource.d/openstack/


}

#pkg_postinst_ontarget_${PN} () { }

FILES_${PN}_append += " \
	${libdir} \
	"
