DESCRIPTION = "Qpid Proton is a high-performance, lightweight messaging library."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b26578452df1dcf3b9a63978282b72d0"

SRC_URI = "https://apache.org/dist/qpid/proton/0.28.0/qpid-proton-0.28.0.tar.gz \
           file://fix-missing-libary-for-cpp-binding.patch \
          "

SRC_URI[sha256sum] = "224e599a4e965a016087b6ce683e55ca918493e12cdd6d91dac1c17d64a7dafe"

DEPENDS= "openssl swig-native python"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX=/usr -DSYSINSTALL_BINDINGS=ON -DPYTHON_EXECUTABLE=`which python`"
BBCLASSEXTEND =+ " native"

PACKAGES =+ "\
         ${PN}-cpp \
         python-${PN} \
         "

#FILES_qpid-proton-c = "${libdir}/libqpid-proton.so.*" 
#FILES_qpid-proton-c += "{libdir}/libqpid-proton-core.so.*" 
#FILES_qpid-proton-c += "${libdir}/libbqpid-proton-proactor.so.*" 

FILES_qpid-proton-cpp = "${libdir}/libqpid-proton-cpp.so.*" 
FILES_python-${PN} = "${libdir}/python*" 

RPROVIDES_${PN} = "qpid-proton-c"

do_install_append() {
         rm -fr ${D}/usr/share
}
