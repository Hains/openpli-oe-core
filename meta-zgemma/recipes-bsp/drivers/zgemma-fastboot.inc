SUMMARY = "${MACHINE} fastboot files"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"
PR = "${SRCDATE}"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit deploy

SRC_URI = "http://downloads.openpli.org/archive/zgemma/zgemma-fastboot-${HICHIPSET}-${SRCDATE}.zip"

S = "${UNPACKDIR}"

ALLOW_EMPTY:${PN} = "1"
do_configure[nostamp] = "1"

do_deploy() {
    install -d ${DEPLOY_DIR_IMAGE}/zgemma-partitions-${MACHINE}/${MACHINE}
    install -m 0755 ${UNPACKDIR}/rescue_fastboot_${MACHINE}.bin ${DEPLOY_DIR_IMAGE}/zgemma-partitions-${MACHINE}/fastboot.bin
    install -m 0755 ${UNPACKDIR}/fastboot_${MACHINE}.bin ${DEPLOY_DIR_IMAGE}/zgemma-partitions-${MACHINE}/${MACHINE}/fastboot.bin
}

addtask deploy before do_build after do_install

INSANE_SKIP:${PN} += "already-stripped"
