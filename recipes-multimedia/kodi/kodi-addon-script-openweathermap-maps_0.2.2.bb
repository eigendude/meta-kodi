SUMMARY = "Weather maps from openweathermap.org"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6e972bc8088a81a1794fe852c497f0ec"

KODIADDONNAME = "script.openweathermap.maps"

SRC_URI = "https://mirrors.kodi.tv/addons/leia/${KODIADDONNAME}/${KODIADDONNAME}-${PV}.zip"
SRC_URI[md5sum] = "43bcfe25f860fec38f323fb800dcbe8d"
SRC_URI[sha256sum] = "a2f0b581e0cdb8f5092e0ba875a8e5d5b2e7ec6044cafd09661501e9830c3154"

RDEPENDS_${PN} = "kodi \
"

S = "${WORKDIR}/${KODIADDONNAME}"

ADDON_DEST = "/root/.kodi/addons/${KODIADDONNAME}"

do_install() {
    install -d ${D}${ADDON_DEST}
    cd ${S} && find . -type f -exec install -Dm 0644 "{}" "${D}${ADDON_DEST}/{}" \;
}

FILES_${PN} += "${ADDON_DEST}/* \
"
