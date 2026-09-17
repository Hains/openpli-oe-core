DESCRIPTION = "Chromium and YoutubeTV"
SECTION = "base"
PRIORITY = "required"
LICENSE = "LicenseRef-LICENSE-CLOSED"

COMPATIBLE_MACHINE = "^(vu*4k*)$"

include chromium-browser-${MACHINE}.bb
