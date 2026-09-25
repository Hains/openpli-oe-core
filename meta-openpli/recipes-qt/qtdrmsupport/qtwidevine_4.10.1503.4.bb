SUMMARY = "CDM pepper plugin Widevine"
DESCRIPTION = "Install widevine components for Qt"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
DEPENDS = "qtwebengine"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "file://libwidevinecdm-${PV}_armhf.zip"

S = "${UNPACKDIR}"

do_install() {
	install -d ${D}/usr
	install -d ${D}/usr/lib
	install -d ${D}/usr/lib/chromium
	install -m755 ${S}/libwidevinecdm.so ${D}/usr/lib/chromium
}

do_package_qa() {
}

FILES:${PN} = "/usr/lib/chromium"

RDEPENDS:${PN} += "qtwebengine"

INSANE_SKIP:${PN} += "ldflags already-stripped"
