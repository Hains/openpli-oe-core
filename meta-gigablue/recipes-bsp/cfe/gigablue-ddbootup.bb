SUMMARY = "ddbootup for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE}"

PV = "1.0"
PR = "r1"

S = "${UNPACKDIR}"

do_compile() {
}

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rcS.d
    echo '#! /bin/sh' > ${UNPACKDIR}/ddbootup
    ${@bb.utils.contains("MACHINE_FEATURES", "gigabluelcd", "echo 'echo 1 > /proc/stb/lcd/mode' >> ${UNPACKDIR}/ddbootup" , "", d)}
    echo 'touch /dev/dbox/lcd0' >> ${UNPACKDIR}/ddbootup
    echo 'echo ${MACHINE} > /proc/stb/info/gbmodel' >> ${UNPACKDIR}/ddbootup
    install -m 0755 ${UNPACKDIR}/ddbootup ${D}${sysconfdir}/init.d
    ln -sf ../init.d/ddbootup ${D}${sysconfdir}/rcS.d/S66ddbootup
}

FILES:${PN} += "${sysconfdir}"
