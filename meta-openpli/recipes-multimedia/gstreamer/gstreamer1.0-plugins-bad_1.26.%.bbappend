FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.6"

SRC_URI[sha256sum] = "6636f2c2289ceda52c4aba971338c81e2b5780d3381bd3673c1c116ec87587c3"

SRC_URI:append = "file://001-rtmp-hls-tsdemux-fix.patch \
                  file://003-rtmp-fix-seeking-and-potential-segfault.patch \
"

PACKAGECONFIG = "${GSTREAMER_ORC} bz2 closedcaption curl dash dtls faac faad hls openssl opusparse \
                 rsvg rtmp sbc smoothstreaming sndfile ttml uvch264 webp \
"
