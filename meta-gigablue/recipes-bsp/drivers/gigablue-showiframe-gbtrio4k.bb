SUMMARY = "showiframe for Gigablue Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "^(gbtrio4k)$"

SRCDATE = "20180301"

PV = "${SRCDATE}"
PR = "r0"

RPROVIDES:${PN}  = "showiframe"
RREPLACES:${PN}  = "showiframe"
RCONFLICTS:${PN} = "showiframe"

SRC_URI = "http://downloads.openpli.org/archive/gigablue/${MACHINE}-showiframe-${SRCDATE}.tar.gz"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/showiframe ${D}/${bindir}
}

do_package_qa() {
}

FILES:${PN}  = "${bindir}/showiframe"

SRC_URI[md5sum] = "898ccb22efbcc90123fdc9c1d794b078"
SRC_URI[sha256sum] = "8c691126d8d505c3943ebbcf55a50adfef6a38787d2d255863c4a43362f527a3"
