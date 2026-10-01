DESCRIPTION = "shared lib for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "curl"

PV = "${SRCDATE}"
PR = "r1"

inherit lib_package

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

SRC_URI = "http://downloads.openpli.org/archive/qviart/hisi3798mv200-hilib-${SRCDATE}.tar.gz"

S = "${UNPACKDIR}/hilib"

do_configure() {
}

do_compile() {
}

do_install() {
	install -d ${D}${libdir}
	install -m 0755 ${S}/*.so ${D}${libdir}/
}

do_package_qa() {
}

FILES:${PN} += "${libdir}/*"

INSANE_SKIP:${PN} = "already-stripped dev-so"
