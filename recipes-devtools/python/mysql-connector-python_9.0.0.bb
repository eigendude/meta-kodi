SUMMARY = "MySQL Connector/Python enables Python programs to access MySQL databases."
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e94afccb06cf8ffefdd2361ea575a821"

SRC_URI = "git://github.com/mysql/mysql-connector-python.git;protocol=https;branch=master"
SRCREV = "59817f3de42d98ac2875a14ea265d77bd0ac3805"

RDEPENDS:${PN} = "python3"

inherit setuptools3

S = "${WORKDIR}/git"

