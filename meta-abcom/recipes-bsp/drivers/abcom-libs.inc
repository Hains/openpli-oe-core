DESCRIPTION = "${MACHINE} libraries"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
PR = "${SRCDATE}"
PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS:${PN} = "libbluray libcrypto-compat"

VER ?= "${@bb.utils.contains('TARGET_ARCH', 'aarch64', '64' , '', d)}"

SRC_URI = "http://downloads.openpli.org/archive/abcom/${MACHINE}-libs${VER}-${SRCDATE}.zip"

S = "${UNPACKDIR}"

INHIBIT_PACKAGE_STRIP = "1"

# Disable anything auto depending on hisilicon libs
EXCLUDE_FROM_SHLIBS = "1"

# The driver is a set of binary libraries to install
# there's nothing to configure or compile
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -d ${D}${libdir}/hisilicon
	install -m 0755 ${S}/hisilicon/* ${D}${libdir}/hisilicon
	install -m 0755 ${S}/ffmpeg/* ${D}${libdir}/hisilicon
	ln -sf /lib/ld-linux-armhf.so.3 ${D}${libdir}/hisilicon/ld-linux.so
	rm -f ${D}${libdir}/hisilicon/libcrypto.so.* ${D}${libdir}/hisilicon/libssl.so.*
}

do_package_qa() {
}

FILES:${PN} = "${libdir}/hisilicon/*"
FILES:${PN}-dev = ""

INSANE_SKIP:${PN} += "ldflags already-stripped dev-so"
