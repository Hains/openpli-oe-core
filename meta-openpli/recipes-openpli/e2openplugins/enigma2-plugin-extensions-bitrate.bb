MODULE = "Bitrate"
DESCRIPTION = "Bitrate viewer"

require conf/license/license-gplv2.inc

require openplugins-replace-pli.inc
PR = "r1.2"

require openplugins.inc

inherit autotools gettext python3native

DEPENDS += "python3"

SRC_URI:append = " file://drop-python3-six.patch"

EXTRA_OECONF = " \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR}"

FILES:${PN} = "${libdir} ${bindir}"
