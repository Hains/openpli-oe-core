FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://drop-sslv3-client-method.patch"

PACKAGECONFIG = "openssl zlib \
                ${@bb.utils.filter('DISTRO_FEATURES', 'ipv6', d)}"
