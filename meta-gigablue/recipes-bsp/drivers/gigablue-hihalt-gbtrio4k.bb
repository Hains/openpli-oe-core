SUMMARY = "halt for Gigablue Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "harfbuzz"

SRCDATE = "20190907"

PV = "${SRCDATE}"
PR = "r1"

INITSCRIPT_NAME = "suspend"
INITSCRIPT_PARAMS = "start 89 0 ."
inherit update-rc.d

SRC_URI  = "http://downloads.openpli.org/archive/gigablue/${MACHINE}-hihalt-${SRCDATE}.tar.gz \
    file://suspend.sh \
    file://standby_leave.sh \
    file://standby_enter.sh \
"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/hihalt ${D}/${bindir}
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${S}/suspend.sh ${D}${sysconfdir}/init.d/suspend
    install -d ${D}/usr/script
    install -m 0755 ${S}/standby_leave.sh ${D}/usr/script/standby_leave.sh
    install -m 0755 ${S}/standby_enter.sh ${D}/usr/script/standby_enter.sh
}

do_package_qa() {
}

FILES:${PN}  = "${bindir}/hihalt ${sysconfdir}/init.d /usr/script"

SRC_URI[md5sum] = "a8fa73b3ef6bbabc32c59bcf7fcc1864"
SRC_URI[sha256sum] = "f8c592c5448576df8e52b32135cb0d0a064f4953fa499ed555baa2e8c68a16aa"
