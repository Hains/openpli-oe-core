DESCRIPTION = "first bootlogo splash image"
SECTION = "base"
PRIORITY = "required"
PACKAGE_ARCH = "${MACHINE_ARCH}"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

COMPATIBLE_MACHINE = "lunix|lunixco|lunix4k|lunix3_4k"

PV = "1.0"
PR = "r0"

S = "${UNPACKDIR}"

SRC_URI:append:lunix3-4k = "file://lunix3-4k_splash.bmp"
SRC_URI:append:lunix4k = "file://lunix4k_splash.bmp"
SRC_URI:append:lunix  = " \
	file://${MACHINE}_splash.bmp \
	file://${MACHINE}_splash1.bmp \
	file://${MACHINE}_splash2.bmp \
	file://${MACHINE}_splash3.bmp \
"
SRC_URI:append:lunixco = " \
	file://${MACHINE}_splash.bmp \
	file://${MACHINE}_splash1.bmp \
	file://${MACHINE}_splash2.bmp \
	file://${MACHINE}_splash3.bmp \
"

inherit deploy

do_deploy() {
	install -m 0644 ${UNPACKDIR}/*.bmp ${DEPLOYDIR}/
}

addtask deploy before do_build after do_install
