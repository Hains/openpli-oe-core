DESCRIPTION = "PlutoTV plugin for enigma2"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

RREPLACES:${PN} = "enigma2-plugin-extensions-pluto"

RDEPENDS:${PN} = "python3-requests"

inherit gitpkgv allarch gettext setuptools3-openplugins python3-compileall

PV = "1.1+git"
PKGV = "1.1+git${GITPKGV}"

SRC_URI = "git://github.com/OpenViX/PlutoTV.git;protocol=https;branch=master"
