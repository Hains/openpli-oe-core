SECTION = "base"
LICENSE = "LicenseRef-LICENSE-CLOSED"
PRIORITY = "required"

PR = "r7"

SRC_URI = "http://downloads.openpli.org/archive/vuplus/vmlinuz-initrd_${MACHINE}_${SRCDATE}.tar.gz"

S = "${UNPACKDIR}"

FILES:${PN} = "/boot"

INHIBIT_PACKAGE_STRIP = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"
