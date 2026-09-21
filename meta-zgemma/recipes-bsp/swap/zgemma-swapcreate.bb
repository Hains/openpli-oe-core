SUMMARY = "create swap"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "1.0"
PR = "r0"

SRC_URI = "file://createswap.sh"

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc3.d
    install -m 0755 ${UNPACKDIR}/createswap.sh ${D}${sysconfdir}/init.d/createswap.sh
    ln -sf ../init.d/createswap.sh ${D}${sysconfdir}/rc3.d/S98createswap
}

COMPATIBLE_MACHINE = "(h7|h17|h17twin)"
