SUMMARY = "High-level Twisted HTTP Client API"
DESCRIPTION = "Provides simple, higher level API for making HTTP requests when using Twisted."
HOMEPAGE = "https://github.com/twisted/treq"
AUTHOR = "David Reid <dreid@dreid.org>"
MAINTAINER = "Tom Most <twm@freecog.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5dd67fd17479587f7093769d95ef186"
SECTION = "devel/python"

S = "${UNPACKDIR}/${BP}"

DEPENDS += "python3-incremental-native"

RDEPENDS:${PN} += "python3-attrs python3-hyperlink python3-incremental python3-requests python3-twisted python3-python-multipart"

RDEPENDS:${PN}-dbg = "${PN}"
FILES:${PN}-dbg = " \
    ${PYTHON_SITEPACKAGES_DIR}/${PN}-*.egg-info \
    ${PYTHON_SITEPACKAGES_DIR}/${PN}/test \
"

PYPI_PACKAGE = "treq"

SRC_URI[sha256sum] = "43e728e12aca2d897c626cf07dc7b4392749b73de050a7d66e086cb3a6e15da9"

inherit pypi python_hatchling

SRC_URI:append = " file://fix-broken-module-import.patch"

include python3-package-split.inc

do_compile[network] = "1"
