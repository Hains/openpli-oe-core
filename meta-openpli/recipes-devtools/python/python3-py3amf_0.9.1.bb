SUMMARY = "AMF support for Python"
HOMEPAGE = "https://github.com/StdCarrot/Py3AMF"
AUTHOR = "The Py3AMF Project <yhbu@stdc.so>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f078cf548d49a50c4b44150d5a30585a"

SRC_URI[md5sum] = "ed9f214160c64d42f9064b97bdf0af9c"
SRC_URI[sha256sum] = "c9414aa31032978f258fd97c7334f60da0bda9b5e73fa526f7c43a995da5bf78"

inherit pypi setuptools3

include python3-package-split.inc
