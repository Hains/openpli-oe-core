FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-ffmpeg_ac4.patch \
            file://0002-fix-mpegts.patch \
            file://0003-allow-to-choose-rtmp-impl-at-runtime.patch \
            file://0004-hls-replace-key-uri.patch \
            file://0005-mips64-cpu-detection.patch \
            file://0006-optimize-aac.patch \
            file://0007-increase-buffer-size.patch \
            file://0008-recheck-discard-flags.patch \
            file://0009-ffmpeg-fix-edit-list-parsing.patch \
            file://0011-rtsp.patch \
            file://0012-dxva2.patch \
            file://0013-add-av_stream_get_first_dts-for-chromium.patch \
            "

EXTRA_FFCONF = " \
    --prefix=${prefix} \
    --disable-static \
    --disable-runtime-cpudetect \
    --enable-ffprobe \
    --disable-altivec \
    --disable-amd3dnow \
    --disable-amd3dnowext \
    --disable-mmx \
    --disable-mmxext \
    --disable-sse \
    --disable-sse2 \
    --disable-sse3 \
    --disable-ssse3 \
    --disable-sse4 \
    --disable-sse42 \
    --disable-avx \
    --disable-xop \
    --disable-fma3 \
    --disable-fma4 \
    --disable-avx2 \
    --disable-inline-asm \
    --disable-x86asm \
    --disable-fast-unaligned \
    --enable-protocol=http \
    --enable-protocol=rtmp \
    --enable-demuxer=dash \
    --enable-demuxer=rtsp \
    \
    --disable-muxers \
    --enable-muxer=adts \
    --enable-muxer=mpeg1video \
    --enable-muxer=h264 \
    --enable-muxer=mp4 \
    --enable-muxer=ac3 \
    --enable-muxer=aac \
    --enable-muxer=mp3 \
    --enable-muxer=mpeg \
    --enable-muxer=image2 \
    --enable-muxer=mjpeg \
    --enable-muxer=rawvideo \
    --enable-muxer=mpeg2video \
    --enable-muxer=matroska \
    --enable-muxer=m4v \
    --enable-muxer=image2pipe \
    --enable-muxer=apng \
    --enable-muxer=mpegts \
    --enable-muxer=asf \
    --enable-muxer=spdif \
    --enable-muxer=rtsp \
    --disable-encoders \
    --enable-encoder=ac3 \
    --enable-encoder=aac \
    --enable-encoder=mp2 \
    --enable-encoder=mpeg1video \
    --enable-encoder=libx264 \
    --enable-encoder=ljpeg \
    --enable-encoder=mjpeg \
    --enable-encoder=mpeg4 \
    --enable-encoder=jpeg2000 \
    --enable-encoder=jpegls \
    --enable-encoder=png \
    --enable-encoder=rawvideo \
    --enable-encoder=wmav2 \
    --enable-encoder=pcm_s16le \
    --enable-decoder=truehd \
    --enable-decoder=mlp \
    \
    --disable-debug \
    --disable-doc \
    --disable-htmlpages \
    --disable-manpages \
    --disable-podpages \
    --disable-txtpages \
    ${@bb.utils.contains("TARGET_ARCH", "mipsel", "--enable-mipsfpu --extra-libs=-latomic --disable-mips32r5 --disable-mipsdsp --disable-mipsdspr2 \
                                       --disable-loongson2 --disable-loongson3 --disable-mmi --disable-msa", "", d)} \
    ${@bb.utils.contains("TARGET_ARCH", "arm", "--enable-armv6 --enable-armv6t2 --enable-vfp --enable-neon", "", d)} \
    "
