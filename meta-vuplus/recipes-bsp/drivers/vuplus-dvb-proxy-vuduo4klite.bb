LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

COMPATIBLE_MACHINE = "^(vuduo4klite)$"

PROVIDES += "vuplus-dvb-proxy"
RPROVIDES:${PN} += "vuplus-dvb-proxy"

ALLOW_EMPTY:${PN} = "1"

PACKAGE_ARCH := "${MACHINE_ARCH}"
PR = "r1"

# dummy
# duo4klite drivers are included in platform-util
