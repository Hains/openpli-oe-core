SECTION = "base"
LICENSE = "LicenseRef-LICENSE-CLOSED"

SRC_URI = " \
    http://downloads.openpli.org/archive/qviart/platform-util-${CHIP}.tar.gz \
    file://${INITSCRIPT_NAME}.sysvinit \
"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/* ${D}${bindir}
    install -d ${D}/etc/init.d
    install -m 0755 ${UNPACKDIR}/${INITSCRIPT_NAME}.sysvinit ${D}/etc/init.d/${INITSCRIPT_NAME}
}

do_package_qa[noexec] = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
FILES:${PN} = "/"

inherit update-rc.d

INITSCRIPT_PARAMS = "start 65 S . stop 90 0 ."
INITSCRIPT_NAME = "dags-platform-util"

INSANE_SKIP:${PN} += "already-stripped"
