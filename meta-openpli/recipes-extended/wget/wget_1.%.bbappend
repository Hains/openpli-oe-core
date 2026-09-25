PACKAGECONFIG = "openssl zlib \
                ${@bb.utils.filter('DISTRO_FEATURES', 'ipv6', d)}"
