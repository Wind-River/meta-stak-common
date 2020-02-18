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

DESCRIPTION = "Beaker is a web session and general caching library that includes WSGI middleware for use in web applications."

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5297e0e46f5be6c86a87e35afe958cc7"

SRCREV = "4a2cb747c16dc58af39b1ae56e1cf14dfeb9c9a7"
PROTOCOL = "https"
BRANCH = "master"
S = "${WORKDIR}/git"
PV = "1.10.1+git${SRCPV}"

SRC_URI = "git://github.com/bbangert/beaker;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH}"


DEPENDS += " python"
inherit setuptools distutils pkgconfig
