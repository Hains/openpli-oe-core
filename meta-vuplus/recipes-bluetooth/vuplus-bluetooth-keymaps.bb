SUMMARY = "Vu+ Bluetooth RCU keymap"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "^(vuduo4klite)$"

SRC_URI = "file://70-vuplus-bluetooth-rcu.hwdb"

S = "${UNPACKDIR}"

RDEPENDS:${PN} = "eudev-hwdb"

do_install() {
	install -d ${D}${sysconfdir}/udev/hwdb.d
	install -m 0644 ${S}/70-vuplus-bluetooth-rcu.hwdb \
		${D}${sysconfdir}/udev/hwdb.d/70-vuplus-bluetooth-rcu.hwdb
}

FILES:${PN} = "${sysconfdir}/udev/hwdb.d/70-vuplus-bluetooth-rcu.hwdb"

PACKAGE_WRITE_DEPS += "qemuwrapper-cross"

pkg_postinst:${PN} () {
	if test -n "$D"; then
		$INTERCEPT_DIR/postinst_intercept update_udev_hwdb ${PKG} mlprefix=${MLPREFIX} binprefix=${MLPREFIX}
	else
		udevadm hwdb --update
	fi
}

