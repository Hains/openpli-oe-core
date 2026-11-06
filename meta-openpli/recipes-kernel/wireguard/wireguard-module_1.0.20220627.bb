require wireguard.inc

MAKE_TARGETS = "module"
MODULE_NAME = "wireguard"

SRC_URI = " \
    https://git.zx2c4.com/wireguard-linux-compat/snapshot/wireguard-linux-compat-${PV}.tar.xz \
    file://0001-fix-fallback-macro-missing.patch \
    "

SRC_URI[sha256sum] = "19b181e5c7d2260c23ecad4ad324425fd8e88200d97a885a2c7d4bd26cd61461"

S = "${UNPACKDIR}/wireguard-linux-compat-${PV}/src"

inherit module kernel-arch

DEPENDS = "bc-native virtual/kernel libmnl"
RRECOMMENDS:${PN} = "kernel-module-xt-hashlimit"

# This module requires Linux 3.10 higher and several networking related
# configuration options. For exact kernel requirements visit:
# https://www.wireguard.io/install/#kernel-requirements

EXTRA_OEMAKE:append = " \
    KERNELDIR=${STAGING_KERNEL_DIR} \
"

KERNEL_VERSION = "${@oe.kernel.get_version_headers('${STAGING_KERNEL_DIR}') or oe.utils.read_file('${PKGDATA_DIR}/kernel-depmod/kernel-abiversion')}"
RPROVIDES:${PN} = "${@ 'kernel-module-wireguard' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '5.6') < 0) else '' }"

# Kernel module packages MUST begin with 'kernel-module-', otherwise
# multilib image generation can fail.
#
# The following line is only necessary if the recipe name does not begin
# with kernel-module-.
PKG:${PN} = "kernel-module-${MODULE_NAME}"

module_do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/${MODULE_NAME}
    install -m 0644 ${MODULE_NAME}.ko \
    ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/kernel/${MODULE_NAME}/${MODULE_NAME}.ko
}
