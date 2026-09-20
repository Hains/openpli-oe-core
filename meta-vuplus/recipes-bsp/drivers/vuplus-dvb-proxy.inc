DESCRIPTION = "Hardware drivers for VuPlus"
SECTION = "base"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

PV = "${KV}"
PR = "${SRCDATE}.${SRCDATE_PR}"

SRC_URI = "http://downloads.openpli.org/archive/vuplus/vuplus-dvb-proxy-${MACHINE}-${PV}-${PR}.tar.gz"

S = "${UNPACKDIR}"

#inherit module-base
DEPENDS = "virtual/kernel"
do_configure[depends] += "virtual/kernel:do_shared_workdir"
KERNEL_VERSION = "${@oe.utils.read_file('${STAGING_KERNEL_BUILDDIR}/kernel-abiversion')}"

do_install() {
        install -d ${D}/lib/modules/${KERNEL_VERSION}/extra
        for f in *.ko; do
                install -m 0644 ${UNPACKDIR}/$f ${D}/lib/modules/${KERNEL_VERSION}/extra/$f;
        done
}

pkg_postinst:${PN} () {
        if [ -d /proc/stb ]; then
                depmod -a
        fi
        true
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
FILES:${PN} = "/"
