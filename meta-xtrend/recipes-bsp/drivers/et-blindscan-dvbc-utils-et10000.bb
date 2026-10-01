DESCRIPTION = "Utils for DVB-C blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "http://downloads.openpli.org/archive/xtrend/et10000-dvbc-blindscan-1.2.zip"

PROVIDES += "virtual/blindscan-dvbc"
RPROVIDES:${PN} += "virtual-blindscan-dvbc"

PV = "1.2"
PR = "r2"

S = "${UNPACKDIR}"

do_compile() {
}

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "459be6d6e8336d182de1ada4a8dfd3c0"
SRC_URI[sha256sum] = "8f67c7f79d8a4b9d7eea5a1574d1945e8c7c6eea5560cadb0566c4533e01bb12"
