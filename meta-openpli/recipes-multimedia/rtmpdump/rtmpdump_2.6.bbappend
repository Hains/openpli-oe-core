FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PROVIDES =+ " librtmp librtmp1"

SRC_URI:append = " \
	file://ksv.patch;striplevel=0 \
	file://iptvplayer_release.patch \
	"
