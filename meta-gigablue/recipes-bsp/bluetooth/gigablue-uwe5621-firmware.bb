SUMMARY = "Firmware files for uwe5621 bluetooth & wifi"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

inherit allarch

SRC_URI = "file://uwe5621.zip"

S = "${UNPACKDIR}"

PACKAGES = "${PN}"
FILES:${PN} += "${nonarch_base_libdir}/firmware"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/uwewifi
    install -m 0644 wcnmodem.bin ${D}${nonarch_base_libdir}/firmware
    install -m 0644 wifi_*.ini ${D}${nonarch_base_libdir}/firmware/uwewifi
    install -d ${D}/etc/bluetooth/uwe5621
    install -m 0644 bt_*.ini ${D}/etc/bluetooth/uwe5621
}
