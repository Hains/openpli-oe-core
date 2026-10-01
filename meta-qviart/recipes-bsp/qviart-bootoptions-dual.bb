SUMMARY = "Multiboot for Hisilicon ${MACHINE}"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PRIORITY = "required"
SECTION = "base"
PACKAGE_ARCH = "${MACHINE}"

PR = "20210223"

SRC_URI = "http://downloads.openpli.org/archive/qviart/dags-bootoptions-${PR}.zip"

S = "${UNPACKDIR}"

do_compile() {
}

do_install() {
	install -d ${D}/boot/
	install -m 0755 ${S}/STARTUP* ${D}/boot/
}

do_package_qa() {
}

INSANE_SKIP:${PN} += "already-stripped"
INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "d57d0b2472f31b65c8b03592a5bbbbd8"
SRC_URI[sha256sum] = "0a65d449eb415771ca564a001b3ea55edc844fa435e04cbb5a38c69fdf5ff5d2"

FILES:${PN} += "/boot/"
