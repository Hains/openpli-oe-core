FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.6"
 
SRC_URI[sha256sum] = "0ba699c7c6c66f4ba640be78cb38a24715add9683f3e3a199f5369dc5a4f04ac"

RDEPENDS:libgstgl-1.0 = "libGLESv2.so"

SRC_URI:append = " file://001-riff-media-added-fourcc-to-all-ffmpeg-mpeg4-video-caps.patch \
                   file://002-subparse-avoid-false-negatives-dealing-with-UTF-8.patch \
                   file://define-surfaceless-mesa-macro.patch \
                   file://0001-audio-resampler-neon.h-Remove-character-w-in-type-sp.patch \
"

PACKAGECONFIG = "${GSTREAMER_ORC} alsa jpeg ogg opus pango png theora vorbis"
