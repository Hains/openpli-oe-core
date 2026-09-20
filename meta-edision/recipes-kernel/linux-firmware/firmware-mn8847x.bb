SUMMARY = "Firmware for mn8847x"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

inherit allarch

SRC_URI = "file://mn8847x.zip"

S = "${UNPACKDIR}"

PACKAGES = "${PN}"
FILES:${PN} += "${nonarch_base_libdir}/firmware"

do_install() {
	install -d ${D}${nonarch_base_libdir}/firmware
	install -m 0644 mn88472.fw ${D}${nonarch_base_libdir}/firmware
	install -m 0644 mn88473.fw ${D}${nonarch_base_libdir}/firmware
}
