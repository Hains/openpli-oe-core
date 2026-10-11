SUMMARY = "${MACHINE} bootargs files"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PR = "${SRCDATE}"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit zgemma-partition-deploy

ZGEMMA_LEGACY_DEPLOY_FILES = "bootargs.bin update_bootargs_${MACHINE}.bin ${MACHINE}/bootargs.bin"

SRC_URI = "http://downloads.openpli.org/archive/zgemma/zgemma-bootargs-${HICHIPSET}-${SRCDATE}.zip"

S = "${UNPACKDIR}"

ALLOW_EMPTY:${PN} = "1"
do_configure[nostamp] = "1"

do_deploy() {
    install -d ${DEPLOYDIR}/zgemma-partitions-${MACHINE}/${MACHINE}
    install -m 0755 ${UNPACKDIR}/rescue_bootargs_${MACHINE}.bin ${DEPLOYDIR}/zgemma-partitions-${MACHINE}/bootargs.bin
    install -m 0755 ${UNPACKDIR}/update_bootargs_${MACHINE}.bin ${DEPLOYDIR}/zgemma-partitions-${MACHINE}/update_bootargs_${MACHINE}.bin
    install -m 0755 ${UNPACKDIR}/bootargs_${MACHINE}.bin ${DEPLOYDIR}/zgemma-partitions-${MACHINE}/${MACHINE}/bootargs.bin
}

addtask deploy before do_build after do_install

INSANE_SKIP:${PN} += "already-stripped"
