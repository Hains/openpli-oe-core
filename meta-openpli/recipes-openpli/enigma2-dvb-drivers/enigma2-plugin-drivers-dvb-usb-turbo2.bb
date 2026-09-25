SUMMARY = "USB DVB driver for Vuplus Tuner Turbo2"

LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RRECOMMENDS:${PN} = " \
    kernel-module-dvb-usb \
    kernel-module-dvb-usb-v2 \
    kernel-module-cypress-firmware \
    kernel-module-dvb-usb-cypress-firmware \
    vuplus-tuner-turbo2 \
    "

PV = "1.0"

ALLOW_EMPTY:${PN} = "1"
