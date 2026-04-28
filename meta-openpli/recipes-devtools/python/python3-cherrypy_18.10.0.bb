SUMMARY = "CherryPy is a pythonic, object-oriented HTTP framework"
HOMEPAGE = "https://cheroot.cherrypy.org/"
SECTION = "devel/python"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a5ad8f932e1fd3841133f20d3ffedda1"
DEPENDS += "python3-setuptools-scm-native"
RDEPENDS:${PN} = "python3-jaraco.collections python3-jaraco.classes python3-jaraco.text python3-jaraco.functools python3-zc.lockfile python3-tempora"

SRC_URI = "https://files.pythonhosted.org/packages/93/e8/2f7ef142d1962d08a8885c4c9942212abecad6a80ccdd1620fd1f5c993fd/cherrypy-${PV}.tar.gz"

SRC_URI[md5sum] = "3f7cf1b729467945218bf553f7232da8"
SRC_URI[sha256sum] = "6c70e78ee11300e8b21c0767c542ae6b102a49cac5cfd4e3e313d7bb907c5891"

S = "${UNPACKDIR}/cherrypy-${PV}"

inherit setuptools3

include python3-package-split.inc
