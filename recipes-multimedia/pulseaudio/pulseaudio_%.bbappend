SYSTEMD_SERVICE_${PN}-server = ""

do_install_append() {
    install -d ${D}/etc/systemd/system/multi-user.target.wants
    ln -sf /usr/lib/systemd/user/pulseaudio.service ${D}/etc/systemd/system/multi-user.target.wants/pulseaudio.service
}
