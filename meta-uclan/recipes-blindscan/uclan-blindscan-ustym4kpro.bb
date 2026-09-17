SUMMARY = "blindscan for Uclan Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES += "virtual/blindscan-dvbs"
RPROVIDES:${PN} += "virtual-blindscan-dvbs"

SRCDATE = "20190305"

PV = "${SRCDATE}"
PR = "r0"

SRC_URI  = "http://downloads.openpli.org/archive/uclan/${MACHINE}-blindscan-${SRCDATE}.zip"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/uclan-blindscan ${D}/${bindir}
}

do_package_qa() {
}

FILES:${PN}  = "${bindir}/uclan-blindscan"

SRC_URI[md5sum] = "ee98e5c30d36a7afaff364e6015e0956"
SRC_URI[sha256sum] = "2eb583117f45a5e7d88a2843ff60ba7cf2420deb1987af83ae6299b8433a21ba"

do_prepare_recipe_sysroot[noexec] = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
do_compile[noexec] = "1"
deltask do_populate_sysroot
