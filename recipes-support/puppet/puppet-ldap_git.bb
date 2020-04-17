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

SUMMARY = "OpenLDAP module for Puppet."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://metadata.json;md5=4244fe391bee02e9ee7259aa7f8dda8b"

PV = "0.2.4"
SRCREV = "480f13af6d17d1d3fcf0dc7b4bd04b49fa4099e1"
PROTOCOL = "https"
BRANCH = "master"
S = "${WORKDIR}/git"

SRC_URI = " \
	git://github.com/torian/puppet-ldap;protocol=${PROTOCOL};rev=${SRCREV};branch=${BRANCH} \
	file://puppet-ldap/Add-gemspec.patch \
	"
inherit ruby 

DEPENDS += " \
	ruby \
	facter \
	"

RDEPENDS_${PN} += " \
	ruby \
	facter \
	puppet \
	perl \
	"

RUBY_INSTALL_GEMS = "${PN}-${PV}.gem"

do_install_append() {
	install -d -m 0755 ${D}/${datadir}/puppet/modules/ldap
	tar -C ${S} -cf - --exclude "patches" --exclude "*.gem*" . | tar --no-same-owner -xf - -C ${D}/${datadir}/puppet/modules/ldap
}

FILES_${PN} += " ${datadir}"
