SUMMARY = "Gigablue Blootooth RCU keymaps"
MAINTAINER = "gigablue"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"


#different BT RCU device have it's own kl on /etc/keymap/
#according to vendor id and product id of device.

PV = "1.0"
PR = "r1"

SRC_URI  = "file://Vendor_0508_Product_0110.kl"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}/etc/keymap
    install -m 0755 ${S}/Vendor_0508_Product_0110.kl ${D}/etc/keymap/
}
