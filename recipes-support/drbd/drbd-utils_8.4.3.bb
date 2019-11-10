SUMMARY = "Distributed block device driver for Linux"

DESCRIPTION = " DRBD, developed by LINBIT, is a software that allows RAID 1 functionality over \
	TCP/IP and RDMA for GNU/Linux. DRBD is a block device which is designed to build high \
	availability clusters and software defined storage by providing a virtual shared device \
	which keeps disks in nodes synchronised using TCP/IP or RDMA. This simulates RAID 1 but \
	avoids the use of uncommon hardware (shared SCSI buses or Fibre Channel)."
HOMEPAGE = "http://www.drbd.org/"
SECTION = "admin"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=5574c6965ae5f583e55880e397fbb018"

SRC_URI = "git://github.com/LINBIT/drbd-8.4.git;name=drbd-utils "

PV = "8.4.3"

# https://www.linbit.com/downloads/drbd/8.4/archive/

inherit autotools

DEPENDS += " \
	linux-libc-headers \
	glibc \
	"

SRCREV_drbd-utils = "89a294209144b68adb3ee85a73221f964d3ee515"

S = "${WORKDIR}/git"

# UPSTREAM_CHECK_URI = "https://github.com/LINBIT/drbd-utils/releases"

inherit autotools-brokensep

RDEPENDS_${PN} += "bash perl-module-getopt-long perl-module-exporter perl-module-constant perl-module-overloading perl-module-exporter-heavy"

do_install_append() {
	rm -rf ${D}/var/lock
}
