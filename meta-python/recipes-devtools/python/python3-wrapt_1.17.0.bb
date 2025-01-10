SUMMARY = "A Python module for decorators, wrappers and monkey patching."
HOMEPAGE = "http://wrapt.readthedocs.org/"
LICENSE = "BSD-2-Clause"
SECTION = "devel/python"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc34cbad60bc961452eb7ade801d25f7"

SRC_URI[sha256sum] = "5f370f952971e7d17c7d1ead40e49f32345a7f7a5373571ef44d800d06b1899d"

inherit setuptools3 ptest-python-pytest

SRCREV = "e663d4910a81d666786ac773ad7c16199b01d31b"
SRC_URI += "git://github.com/GrahamDumpleton/wrapt;protocol=https;branch=develop \
"

S = "${WORKDIR}/git"

# python3-misc for 'this' module
RDEPENDS:${PN}-ptest += " \
	python3-misc \
"

RDEPENDS:${PN}:class-target += "\
    python3-stringold \
    python3-threading \
"

BBCLASSEXTEND = "native"
