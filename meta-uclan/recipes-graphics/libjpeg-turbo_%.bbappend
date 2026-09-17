FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

CFLAGS:append:class-target = " -lm"

SRC_URI:append:ustym4ks2ottx = " \
	file://libjpeg.so.8.2.2 \
"

do_install:append:ustym4ks2ottx() {
	install -d ${D}${libdir}
	install -m 0755 ${UNPACKDIR}/libjpeg.so.8.2.2 ${D}${libdir}/
	ln -s libjpeg.so.8.2.2 ${D}${libdir}/libjpeg.so.8
}
