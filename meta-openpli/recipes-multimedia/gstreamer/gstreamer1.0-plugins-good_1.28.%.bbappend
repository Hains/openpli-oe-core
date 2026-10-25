FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PV = "1.28.8"

SRC_URI[sha256sum] = "a7670ed900d3d03be744d25c1873b239896e9a82ce6d17f8febc6fffbaee9521"

SRC_URI:append = " file://001-gstrtpmp4gpay-set-dafault-value-for-MPEG4-without-co.patch"

PACKAGECONFIG = "${GSTREAMER_ORC} amrnb amrwb bz2 cairo flac gdk-pixbuf gudev jpeg lame libpng \
                 mpg123 soup3 speex taglib v4l2 vpx wavpack \
"
