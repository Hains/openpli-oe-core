FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.8"

SRC_URI[sha256sum] = "baa8e86985ad6417cc0ad6e7b79ff2884c6779c8b1c7a6240e7121822c86e524"

SRC_URI:append = " file://001-revert-use-new-gst-adapter-get-buffer.patch"
