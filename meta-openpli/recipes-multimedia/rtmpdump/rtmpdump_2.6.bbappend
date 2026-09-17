FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PROVIDES =+ " librtmp librtmp1"

inherit pkgconfig
