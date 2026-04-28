SUMMARY = "Push Notifications that work with just about every platform!"
HOMEPAGE = "https://github.com/caronc/apprise"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d1700c468c259a17fcf7f51af33a4a2e"

DEPENDS = "python3-babel-native"

RDEPENDS:${PN} = "python3-pyyaml python3-markdown python3-click"

SRC_URI[md5sum] = "e5a9a46eed68c471e40ed0dea389e5c0"
SRC_URI[sha256sum] = "b768f32d99e45ed5f4c3eef1f67903e803c97f97ba61a531a5d0a45d40df90a8"

inherit pypi python_setuptools_build_meta

include python3-package-split.inc
