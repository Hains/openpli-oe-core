DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"
PACKAGES = "qviart-blindscan-utils-${SOC_FAMILY} ${PN}-dbg"

PROVIDES += "virtual/blindscan-dvbs"
RPROVIDES:qviart-blindscan-utils-${SOC_FAMILY} += "virtual-blindscan-dvbs"

PV = "1.0"
PR = "r0"

SRC_URI = "http://downloads.openpli.org/archive/qviart/qviart_blindscan_${SOC_FAMILY}.tar.xz"

S = "${UNPACKDIR}"

INHIBIT_PACKAGE_STRIP = "1"

FILES:${PN}-dbg-${SOC_FAMILY} = "${bindir}/.debug/"

INSANE_SKIP = "32bit-time ldflags"
