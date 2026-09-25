SUMMARY = "Push Notifications that work with just about every platform!"
HOMEPAGE = "https://github.com/caronc/apprise"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d1700c468c259a17fcf7f51af33a4a2e"

DEPENDS = "python3-babel-native python3-wheel-native"

RDEPENDS:${PN} = "python3-pyyaml python3-markdown python3-click"

SRC_URI[md5sum] = "35a4d7809b640bec649af122d4857ebb"
SRC_URI[sha256sum] = "e7689dda71aaf739244d6c8690de13cb1361b8d0a79980fb48bb397455ca0bdd"

inherit pypi python_setuptools_build_meta

include python3-package-split.inc
