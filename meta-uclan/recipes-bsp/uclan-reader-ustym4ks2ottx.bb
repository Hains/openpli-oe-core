SUMMARY = "libreader for uclan Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "libsdl"

COMPATIBLE_MACHINE = "ustym4ks2ottx"

SRCDATE = "20230217"

PV = "${SRCDATE}"
PR = "r0"

SRC_URI = "http://downloads.openpli.org/archive/uclan/${MACHINE}-libreader-${SRCDATE}.tar.gz"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/libreader ${D}/${bindir}
}

do_package_qa() {
}

FILES:${PN}  = "${bindir}/libreader"

SRC_URI[md5sum] = "13ff947017ec392986517fa2c033d63e"
SRC_URI[sha256sum] = "8e50d896ebc87a3b041002774820f704b6dcbe36deb73316306c49ed2a36ce01"
