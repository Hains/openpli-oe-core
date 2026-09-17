SUMMARY = "Edision splash"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-proprietary"
PACKAGE_ARCH = "${MACHINE_ARCH}"

require conf/license/license-gplv2.inc
inherit deploy

PR = "r0"

S = "${UNPACKDIR}"

SRC_URI = "file://splash.bin"

ALLOW_EMPTY:${PN} = "1"

do_deploy() {
    install -m 0644 splash.bin ${DEPLOYDIR}/splash.bin
}

addtask deploy before do_build after do_install
