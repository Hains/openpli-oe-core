SUMMARY = "Realtek 8723B firmware"
HOMEPAGE = "https://www.realtek.com/"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

COMPATIBLE_MACHINE = "osnino|osninoplus|osninopro"

SRC_URI = "git://github.com/edision-open/linux-firmware.git;protocol=https;branch=master"

SRCREV = "5ad65c3de04150106e69b5d6517c838226618798"

inherit allarch

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/
    install -d ${D}${nonarch_base_libdir}/firmware/rtlbt/
    install -m 0644 rtlbt/rtl8723b_fw ${D}${nonarch_base_libdir}/firmware/rtlbt/
}

FILES:${PN} += "${nonarch_base_libdir}/firmware"
