SUMMARY = "Small command line utility used to perform frequency scans for DVB and ATSC transmissions"
DESCRIPTION = "Wscan is a dvb channel scanner that doesn't require an initial frequency table"
HOMEPAGE = "http://wirbel.htpc-forum.de/w_scan/index2.html"
MAINTAINER = "wirbel <w_scan@gmx-topmail.de>"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=892f569a555ba9c07a568a7c0c4fa63a"

SRC_URI = "file://w_scan-20210218.tar.bz2 file://fix-build-with-gcc15.patch"

SRC_URI[md5sum] = "74585dc8621076be98bddca8f4a43f6a"
SRC_URI[sha256sum] = "5d5f3f8964f21cea04013c6681f86ecc51eba34bd53e023b95085df0f2b305ac"

S = "${UNPACKDIR}/w_scan-${PV}"

inherit autotools

FILES:${PN} += "${datadir}"
