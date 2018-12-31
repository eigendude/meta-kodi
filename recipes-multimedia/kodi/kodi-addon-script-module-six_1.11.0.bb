SUMMARY = "Python 2 and 3 compatibility utilities."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=530f34047c21ad45b3199946dd90bea5"

KODIADDONNAME = "script.module.six"

SRC_URI = "https://mirrors.kodi.tv/addons/leia/${KODIADDONNAME}/${KODIADDONNAME}-${PV}.zip"
SRC_URI[md5sum] = "d23c8e7349a0cb181c72e43f17fca4d2"
SRC_URI[sha256sum] = "b81a4951a923ccfdffb5a1b74873f0fb63ccd80c1c11a5af43d2776a35bc7c45"

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
