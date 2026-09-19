DESCRIPTION = "Gigablue xbmc support"
SECTION = "base"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "http://downloads.openpli.org/archive/gigablue/xbmc-support_gb7252_${GLPR}.tar.gz"

S = "${UNPACKDIR}/xbmc-support"

do_install(){
    install -d ${D}${includedir}
    install -d ${D}${libdir}
    install -m 0644 ${S}/gles_init.h ${D}${includedir}
    install -m 0644 ${S}/gles_init.a ${D}${libdir}/gles_init.a
    ln -sf gles_init.a ${D}${libdir}/libgles_init.a
}

PACKAGES = "${PN}"
FILES:${PN} = "${includedir} ${libdir}"

INSANE_SKIP:${PN} = "staticdev"
