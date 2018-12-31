SUMMARY = "dateutil - powerful extensions to datetime."

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8eeb4c610e0948ab8c0e390ff2ac7048"

KODIADDONNAME = "script.module.dateutil"

SRC_URI = "https://mirrors.kodi.tv/addons/leia/${KODIADDONNAME}/${KODIADDONNAME}-${PV}.zip"
SRC_URI[md5sum] = "501972253d5087fc88dfc87b55a8b5a2"
SRC_URI[sha256sum] = "47bd6df9bf7a7fcce93a397b909d18bd53579fc3192f9417aa1a30b1db31e92d"

RDEPENDS_${PN} = "kodi \
    kodi-addon-script-module-six \
"

S = "${WORKDIR}/${KODIADDONNAME}"

ADDON_DEST = "/root/.kodi/addons/${KODIADDONNAME}"

do_install() {
    install -d ${D}${ADDON_DEST}
    cd ${S} && find . -type f -exec install -Dm 0644 "{}" "${D}${ADDON_DEST}/{}" \;
}

FILES_${PN} += "${ADDON_DEST}/* \
"
