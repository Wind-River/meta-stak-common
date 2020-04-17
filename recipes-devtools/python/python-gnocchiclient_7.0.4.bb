#
## Copyright (C) 2019 Wind River Systems, Inc.
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

DESCRIPTION = "python-gnocchiclient"
STABLE = "master"
PROTOCOL = "https"
BRANCH = "master"
SRCREV = "64814b9ace54e0151e9c28f4e57b87dafc984241"
S = "${WORKDIR}/git"
PV = "7.0.4"

LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "git://github.com/gnocchixyz/python-gnocchiclient.git;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH}"
DEPENDS += " \
	python \
	python-pbr-native \
	"

RDEPENDS_${PN}_append = " python-ujson"

inherit setuptools
