SUMMARY = "format POD source into various output formats"
DESCRIPTION = "\
  podlators contains Pod::Man and Pod::Text modules which convert POD input \
  to *roff source output, suitable for man pages, or plain text. It also \
  includes several subclasses of Pod::Text for formatted output to terminals \
  with various capabilities. It is the source package for the Pod::Man and \
  Pod::Text modules included with Perl. \
"
HOMEPAGE = "https://www.eyrie.org/~eagle/software/podlators"

SECTION = "libs"

LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a25b3c873fe34dc2909a5b1ca2de4048"

CPAN_PACKAGE = "podlators"

SRC_URI = "${CPAN_MIRROR}/authors/id/R/RR/RRA/${CPAN_PACKAGE}-${PV}.tar.gz"

SRC_URI[md5sum] = "99d5b0c15d2f72c5218dce1a5a9448c5"
SRC_URI[sha256sum] = "948717da19630a5f003da4406da90fe1cbdec9ae493671c90dfb6d8b3d63b7eb"

S = "${WORKDIR}/${CPAN_PACKAGE}-${PV}"

inherit cpan

RDEPENDS_${PN} = " \
    perl-module-encode \
    perl-module-pod-simple \
"

BBCLASSEXTEND = "native nativesdk"
