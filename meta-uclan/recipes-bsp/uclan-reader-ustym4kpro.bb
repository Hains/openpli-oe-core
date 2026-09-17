SUMMARY = "libreader for uclan Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "libsdl"

COMPATIBLE_MACHINE = "^(ustym4kpro)$"

SRCDATE = "20221220"

PV = "${SRCDATE}"
PR = "r0"

SRC_URI = "http://downloads.openpli.org/archive/uclan/${MACHINE}-libreader-${SRCDATE}.zip"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/libreader ${D}/${bindir}
}

do_package_qa() {
}

FILES:${PN}  = "${bindir}/libreader"

SRC_URI[md5sum] = "9f500f357e10eb3191f4c9f9736c2a50"
SRC_URI[sha256sum] = "1cd12c99cd87366d6261f6647cc0e27f97aa31b3e4c52f9a354dd24145e7771c"

INSANE_SKIP:${PN} += "already-stripped"
