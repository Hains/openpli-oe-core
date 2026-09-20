SECTION = "base"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PRIORITY = "required"

PR = "r7"

SRC_URI = "http://downloads.openpli.org/archive/vuplus/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz"

S = "${UNPACKDIR}"

FILES:${PN} = "/boot"

INHIBIT_PACKAGE_STRIP = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"
