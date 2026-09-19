SUMMARY = "Hardware drivers for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "${KV}-${SRCDATE}"

SRC_URI = "http://downloads.openpli.org/archive/gigablue/${MACHINE}-hiko-${SRCDATE}.zip \
    file://modules \
"

S = "${UNPACKDIR}/hiko"

INHIBIT_PACKAGE_STRIP = "1"

FILES:${PN} += "${sysconfdir}/modules-load.d/_${MACHINE}.conf"
FILES:${PN} += "/lib/modules/${KV}/extra"



do_compile() {
}
do_populate_sysroot() {
}

do_install() {
    install -d ${D}/lib/modules/${KV}/extra
    install -m 0644 ${S}/*.ko ${D}${base_libdir}/modules/${KV}/extra
    install -m 0755  ${S}/load ${D}${base_libdir}/modules/${KV}/extra
    install -d ${D}${sysconfdir}/modules-load.d
    install -m 0644 ${UNPACKDIR}/modules ${D}${sysconfdir}/modules-load.d/_${MACHINE}.conf
}

