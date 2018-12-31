SUMMARY = "Weather maps from openweathermap.org"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6e972bc8088a81a1794fe852c497f0ec"

KODIADDONNAME = "weather.weatherbit.io"

SRC_URI = "https://mirrors.kodi.tv/addons/leia/${KODIADDONNAME}/${KODIADDONNAME}-${PV}.zip"
SRC_URI[md5sum] = "7ddbc0793b21f10dfe630fd1e2c9be8a"
SRC_URI[sha256sum] = "c64ed0d70f30fcb1f1349e5c790f1020f2effe26aef7cedfc0add1ac01b2268f"

RDEPENDS_${PN} = "kodi \
    kodi-addon-script-module-dateutil \
    kodi-addon-script-module-six \
    kodi-addon-script-openweathermap-maps \
"

S = "${WORKDIR}/${KODIADDONNAME}"

ADDON_DEST = "/root/.kodi/addons/${KODIADDONNAME}"

do_install() {
    install -d ${D}${ADDON_DEST}
    cd ${S} && find . -type f -exec install -Dm 0644 "{}" "${D}${ADDON_DEST}/{}" \;
}

FILES_${PN} += "${ADDON_DEST}/* \
"
