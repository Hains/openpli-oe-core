SUMMARY = "Availink demodulator firmware"
HOMEPAGE = "http://www.availink.com/"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

SRC_URI = "git://github.com/edision-open/linux-firmware.git;protocol=https;branch=master"

SRCREV = "824e8de5b7a048eaf49221f7ba788dbb79123715"

inherit allarch

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware/
    install -d ${D}${nonarch_base_libdir}/firmware/availink/
    install -m 0644 availink/dvb-fe-avl68x2-dvbc.fw ${D}${nonarch_base_libdir}/firmware/availink/
    install -m 0644 availink/dvb-fe-avl68x2-dvbsx.fw ${D}${nonarch_base_libdir}/firmware/availink/
    install -m 0644 availink/dvb-fe-avl68x2-dvbtx.fw ${D}${nonarch_base_libdir}/firmware/availink/
}

FILES:${PN} += "${nonarch_base_libdir}/firmware"
