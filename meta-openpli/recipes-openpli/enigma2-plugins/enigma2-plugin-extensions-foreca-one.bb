SUMMARY = "Foreca One"
MAINTAINER = "Lululla"
SECTION = "base"
PRIORITY = "required"
LICENSE = "GPL-2.0-only"

require conf/license/license-gplv2.inc

RDEPENDS:${PN} = "python3-pillow"

inherit allarch gitpkgv python3-compileall

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
VER ="1.0"

SRC_URI = "git://github.com/Belfagor2005/ForecaOne.git;protocol=https;branch=main"

S = "${WORKDIR}/git"

FILES:${PN} = "/usr/*"
FILES:${PN}-src = "${libdir}/enigma2/python/Plugins/Extensions/Foreca1/*.py"

do_install() {
    cp -af --no-preserve=ownership ${S}/usr* ${D}/
}
