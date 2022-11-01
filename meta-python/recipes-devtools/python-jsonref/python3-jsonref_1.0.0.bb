SUMMARY = "jsonref is a library for automatic dereferencing of JSON Reference objects for Python"
HOMEPAGE = "https://github.com/gazpachoking/jsonref"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a34264f25338d41744dca1abfe4eb18f"

SRC_URI[sha256sum] = "db1ab1faa75a5ffaa2693104a7deb23471c716fb2edc4db27b7408bf90dff157"

inherit pypi setuptools3

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += " \
	${PYTHON_PN}-core \
	${PYTHON_PN}-json \
	${PYTHON_PN}-netclient \
"
