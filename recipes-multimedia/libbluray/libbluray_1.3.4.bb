SUMMARY = "ShiftMediaProject libbluray."
HOMEPAGE = "https://github.com/ShiftMediaProject/libbluray"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

SRC_URI = "git://github.com/ShiftMediaProject/libbluray.git;branch=master;protocol=https"

S = "${WORKDIR}/git"
SRCREV = "65143af1228f24ddced34826b66880fc686e15a7"

inherit autotools pkgconfig

DEPENDS = "freetype fontconfig libxml2 libudfread"

EXTRA_OECONF += "--disable-bdjava-jar"

