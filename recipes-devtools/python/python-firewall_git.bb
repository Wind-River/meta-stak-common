DESCRIPTION = "emporarily allow access to your current IP address into security groups, and automatically closes the hole when quitting. Convenient for SSH-ing into a box from a home or from any off-site location without worrying about leaving SSH open to the world or dealing with VPN."

LICENSE = "UNKNOWNi|BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f1e0f09645893c55fb92d53ccea0a57"

#SRC_URI[md5sum] = ""
#SRC_URI[sha256sum] = ""

SRCREV = "59b63088b8b791cc495d809240f94fddaa87dc55"
PROTOCOL = "https"
BRANCH = "master"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/mattrobenolt/firewall;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH}"


DEPENDS += " python"
inherit setuptools distutils pkgconfig
