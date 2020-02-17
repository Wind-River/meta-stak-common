meta-starlingx
=========

meta-stak-common is an OpenEmbedded/Yocto® compatible layer for starlingx® and akraino®

Project License
------------------------

Copyright (C) 2019 Wind River Systems, Inc.

Source code included in the tree for individual recipes is under the LICENSE
stated in the associated recipe (.bb file) unless otherwise stated.

The metadata is under the following license unless otherwise stated.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

Introduction
------------------------

This  layer provides the base for starlingx and akraino port to yocto thud.
By itself, it provides set of generic recipes used by starlingx and akraino 
but without starlingx and akraino patches.
StarlingX modifications, enhancements and patches are in meta-stx.
Akraino modifications, enhancements and patches are in meta-akraino.

For further info: https://www.starlingx.io/


Dependencies
-------------------------

This layer depends on:

```

	 URI: git://git.yoctoproject.org/poky.git
	 revision: HEAD
	 branch: thud

	 URI: git://git.openembedded.org/meta-openembedded
	 revision: HEAD
	 branch: thud
	 
	 URI: git://git.yoctoproject.org/meta-virtualization
	 revision: HEAD
	 branch: thud
	 
	 URI: git://git.yoctoproject.org/meta-cloud-services
	 revision: HEAD
	 branch: thud
	 
	 URI: git://git.yoctoproject.org/meta-selinux
	 revision: HEAD
	 branch: thud
	 
	 URI: git://git.yoctoproject.org/meta-security
	 revision: HEAD
	 branch: thud
	 
	 URI: https://github.com/jiazhang0/meta-secure-core.git
	 revision: HEAD
	 branch: thud
	 
	 URI: https://github.com/rauc/meta-rauc.git
	 revision: HEAD
	 branch: thud
	 
	 URI: git://git.yoctoproject.org/meta-intel
	 revision: HEAD
	 branch: thud
	 
	 URI: https://github.com/intel-iot-devkit/meta-iot-cloud.git
	 revision: HEAD
	 branch: thud
	 
```
You are solely responsible for determining the appropriateness of using or redistributing the above dependencies and assume any risks associated with your exercise of permissions under the license.

Maintenance
-------------------------

Maintainer:
        Babak Sarashki  <babak.sarashki@windriver.com>

# Legal Notices

All product names, logos, and brands are property of their respective owners. All company, product and service names used in this software are for identification purposes only. Wind River is a registered trademarks of Wind River Systems, Inc. Linux is a registered trademark of Linus Torvalds.

Disclaimer of Warranty / No Support: Wind River does not provide support and maintenance services for this software, under Wind River’s standard Software Support and Maintenance Agreement or otherwise. Unless required by applicable law, Wind River provides the software (and each contributor provides its contribution) on an “AS IS” BASIS, WITHOUT WARRANTIES OF ANY KIND, either express or implied, including, without limitation, any warranties of TITLE, NONINFRINGEMENT, MERCHANTABILITY, or FITNESS FOR A PARTICULAR PURPOSE. You are solely responsible for determining the appropriateness of using or redistributing the software and assume any risks associated with your exercise of permissions under the license.
