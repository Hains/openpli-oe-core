SUMMARY = "Phodav WebDAV server"
DESCRIPTION = "phởdav (phodav) is a minimal WebDAV server implementation using GNOME libsoup (RFC 4918.)"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

inherit gitpkgv meson pkgconfig

PV = "3.0+git"
PKGV = "3.0+git${GITPKGV}"
#PR = "r0"

SRC_URI = "git://gitlab.gnome.org/GNOME/phodav.git;protocol=https;branch=master"
SRCREV = "e146b12bae68fcc554e77b81cea0acd464b1226b"

DEPENDS = "avahi libsoup"
