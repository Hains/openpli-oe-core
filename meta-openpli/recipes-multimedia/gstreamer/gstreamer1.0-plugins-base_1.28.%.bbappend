FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.3"
 
SRC_URI[sha256sum] = "27880f3d87efa3bb5aa5f99f7ef6e4be7c95229f44eee928c1633d32e87d0099"

RDEPENDS:libgstgl-1.0 = "libGLESv2.so"

SRC_URI:append = " file://001-riff-media-added-fourcc-to-all-ffmpeg-mpeg4-video-caps.patch \
                   file://002-subparse-avoid-false-negatives-dealing-with-UTF-8.patch \
                   file://define-surfaceless-mesa-macro.patch \
                   file://0001-audio-resampler-neon.h-Remove-character-w-in-type-sp.patch \
"

PACKAGECONFIG = "${GSTREAMER_ORC} alsa jpeg ogg opus pango png theora vorbis"
