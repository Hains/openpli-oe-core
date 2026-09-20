SUMMARY = "Create the usb ugrade file"
LICENSE = "LicenseRef-LICENSE-CLOSED"
LIC_FILES_CHKSUM = "file://${OPENPLI_BASE}/meta-openpli/licenses/LICENSE-CLOSED;md5=2d5b03b35d4612637d67724b35738dd7"

SRC_URI = "file://buildimage.zip"

S = "${UNPACKDIR}"

do_install () {
        install -d ${D}/${sbindir}
        install -m 775 ${S}/mkupdate ${D}/${sbindir}
}

INSANE_SKIP:${PN} += "ldflags"
