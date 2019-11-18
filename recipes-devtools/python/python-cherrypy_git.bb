#
# Copyright (C) 2019 Wind River Systems, Inc.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
#

SUMMARY = " CherryPy is a pythonic, object-oriented HTTP framework"
DESCRIPTION = "\
	It allows building web applications in much the same way one would build any other object-oriented program. \
	This design results in less and more readable code being developed faster. It's all just properties and methods. \
	It is now more than ten years old and has proven fast and very stable. \
	It is being used in production by many sites, from the simplest to the most demanding. \
	"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a8cbc5da4e6892b15a972a0b18622b2b"

SRCREV = "994803e4923e53b7079c79f4e9b502cc1b8d0aa6"
PROTOCOL = "https"
BRANCH = "master"
S = "${WORKDIR}/git"
PV = "18.2.0"

SRC_URI = "git://github.com/cherrypy/cherrypy.git;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH}"


DEPENDS += " python python-setuptools-scm-native"
inherit setuptools distutils pkgconfig

RDEPENDS_${PN} += " \
	python-compression \
	python-crypt \
	python-datetime \
	python-email \
	python-fcntl \
	python-html \
	python-io \
	python-json \
	python-logging \
	python-netclient \
	python-netserver \
	python-profile \
	python-pydoc \
	python-xml \
	python-unixadmin \
	"
	
RDEPENDS_${PN} += " \
	python-cheroot \
	python-contextlib2 \
	python-memcached \
	python-portend \
	python-pyopenssl \
	python-routes \
	python-simplejson \
	python-six \
	python-zc-lockfile \
	"
