FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.8"

SRC_URI[sha256sum] = "670d888bde8242579b0d8e91f60cf337aa7be20ca7c315ebfbdd6e5a9218d104"

SRC_URI:append = "file://001-rtmp-hls-tsdemux-fix.patch \
                  file://003-rtmp-fix-seeking-and-potential-segfault.patch \
"

PACKAGECONFIG = "${GSTREAMER_ORC} bz2 closedcaption curl dash dtls faac faad hls openssl opusparse \
                 rsvg rtmp sbc smoothstreaming sndfile ttml uvch264 webp \
"
