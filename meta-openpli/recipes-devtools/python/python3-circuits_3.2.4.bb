SUMMARY = "Asynchronous Component based Event Application Framework"
HOMEPAGE = "http://circuitsframework.com/"
AUTHOR = "James Mills <prologic@shortcircuit.net.au>"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b209f6edbb40680bdf62b70a7c097101"

DEPENDS = "python3-setuptools-scm-native"

SRC_URI[md5sum] = "76e4709d796174833dc1482a60c03d82"
SRC_URI[sha256sum] = "78a46658d446983ac4032f5d4820267d7215cda0bc3cbded0a9b3d62cf1011b7"

S = "${UNPACKDIR}/circuits-${PV}"

inherit  pypi python_hatchling

include python3-package-split.inc
