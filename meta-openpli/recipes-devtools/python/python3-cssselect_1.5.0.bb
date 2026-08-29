SUMMARY = "cssselect parses CSS3 Selectors and translates them to XPath 1.0"
HOMEPAGE = "https://github.com/scrapy/cssselect"
SECTION = "devel/python"
AUTHOR = "Ian Bicking <ianb@colorstudy.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=952026b3fd2f625f2a3c0aa21da2493d"

SRC_URI[md5sum] = "465a7b6af9ea95fdefe5357301589b9c"
SRC_URI[sha256sum] = "3cbe82dd7acbee9ba9e5723b5f9e4749826912f1fb31cd7f92aabed5fde15b15"
 
S = "${UNPACKDIR}/cssselect-${PV}"

inherit pypi python_hatchling

include python3-package-split.inc
