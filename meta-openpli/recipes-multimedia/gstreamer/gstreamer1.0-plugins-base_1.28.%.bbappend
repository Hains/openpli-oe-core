FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.8"

SRC_URI[sha256sum] = "ade70e3381fcbb024f1f20aa9ede9b5654aeed39d5bd70b1a98f53015e501117"

RDEPENDS:libgstgl-1.0 = "libGLESv2.so"

SRC_URI:append = " file://001-riff-media-added-fourcc-to-all-ffmpeg-mpeg4-video-caps.patch \
                   file://002-subparse-avoid-false-negatives-dealing-with-UTF-8.patch \
                   file://define-surfaceless-mesa-macro.patch \
"

PACKAGECONFIG = "${GSTREAMER_ORC} alsa jpeg ogg opus pango png theora vorbis"
