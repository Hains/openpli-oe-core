DESCRIPTION = "RapidFuzz provides libraries for fuzzy string matching in various programming languages."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${S}/README.md;md5=3afd99a254ea5aba925a0a915e2672d4"

DEPENDS = "python3-cython-native"

SRC_URI = "git://github.com/rapidfuzz/rapidfuzz;branch=main;protocol=https"

inherit gittag pkgconfig scikit-build-core

PV = "git"
PKGV = "${GITPKGVTAG}"

do_install:append() {
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/*.dist-info
}

FILES:${PN} = "${PYTHON_SITEPACKAGES_DIR}"
FILES:${PN}-src = "${PYTHON_SITEPACKAGES_DIR}/${PN}/*.py \
                   ${PYTHON_SITEPACKAGES_DIR}/${PN}/*/*.py \
                   "
