SUMMARY = "Kodi Media Center joystick support add-on"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/addon.cpp;beginline=1;endline=19;md5=2d005e5c275d156bd1cb2357ee0e21bb"

inherit kodi-addon

SRC_URI = "git://github.com/kodi-game/peripheral.joystick.git;branch=v1.4.7;protocol=https"
SRCREV = "869c6fabf036ae0d1f4db74e930fe0abc0155b9b"

S = "${WORKDIR}/git"

KODIADDONNAME = "peripheral.joystick"
