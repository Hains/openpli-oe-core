DESCRIPTION = "Vu+ API for EGL/OpenGLES"
SECTION = "libs"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "libgles-${MACHINE}"

PROVIDES += "libvupl"
RPROVIDES:${PN} += "libvupl"

PV = "0.1.0"
PR = "${SRCDATE}.${SRCDATE_PR}"

SRC_URI = "https://source.mynonpublic.com/vuplus/release/libvupl/libvupl-${PV}-${MACHINE}-${PR}.tar.gz"

S = "${UNPACKDIR}/libvupl-${PV}-${MACHINE}"

inherit pkgconfig

do_install() {
	install -d ${D}${includedir}
	install -m 644 ${S}/include/* ${D}${includedir}/
	install -d ${D}${libdir}
	install -m 755 ${S}/lib/*.so ${D}${libdir}/
	install -d ${D}${libdir}/pkgconfig
	cp -r ${S}/lib/pkgconfig/*.pc ${D}${libdir}/pkgconfig/
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
