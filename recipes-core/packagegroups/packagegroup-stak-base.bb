SUMMARY = "Base rootfs for stx and akraino"

PR = "r0"

#
# packages which content depend on MACHINE_FEATURES need to be MACHINE_ARCH
#

PACKAGE_ARCH = "${MACHINE_ARCH}"


inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
	packagegroup-stak-base \
	packagegroup-stak-perl \
	packagegroup-stak-python \
	packagegroup-stak-ruby \
	packagegroup-stak-puppet \
	"

RDEPENDS_packagegroup-stak-base = " \
	lighttpd \
	tcpdump \
	tzdata \
	numactl \
	samba \
	mariadb \
	traceroute \
	wget \
	expect \
	boost \
	alsa-lib \
	collectd \
	conntrack-tools \
	dosfstools \
	docker \
	docker-registry \
	dracut \
	drbd-utils \
	efibootmgr \
	efivar \
	expat \
	facter \
	hwdata \
	iscsi-initiator-utils \
	isomd5sum \
	jansson \
	json-c \
	kexec-tools \
	keyutils \
	kubernetes \
	libcgroup \
	libdrm \
	libedit \
	libestr \
	libev \
	libgudev \
	libibverbs \
	libjpeg-turbo \
	libndp \
	oath \
	libogg \
	libpcap \
	libpciaccess \
	libpipeline \
	libpng \
	libproxy \
	libpwquality \
	libseccomp \
	libsm \
	libssh2 \
	sysfsutils \
	libteam \
	libuser \
	libutempter \
	libvorbis \
	cyrus-sasl \
	ipmitool \
	iperf3 \
	iotop \
	lsof \
	lsscsi \
	lz4 \
	lzop \
	lz4 \
	lzop \
	mailcap \
	mailx \
	mdadm \
	mod-wsgi \
	mokutil \
	mozjs \
	mtools \
	mysql-python \
	libnewt-python \
	nss-pam-ldapd \
	ntfs-3g-ntfsprogs \
	openipmi \
	openldap \
	libopus \
	ovmf-shell-efi \
	p11-kit \
	perf \
	polkit \
	popt \
	procps \
	pulseaudio \
	screen \
	seabios \
        smartmontools \
        snappy \
        socat \
        spawn-fcgi \
        spice \
        swig \
        sysstat \
        tcp-wrappers \
        trousers \
        xfsprogs \
        yajl \
        zip \
        c-ares \
        cifs-utils \
        createrepo-c \
        gdbm \
        gmp \
        groff \
        libnl \
        mcstrans \
        linuxptp \
        lua \
        lldpd \
        multipath-tools \
        flac \
        freetype \
        geoip \
        glusterfs \
        gobject-introspection \
        gperftools \
        gobject-introspection \
        gperftools \
        gpm \
        hiera \
        leveldb \
        libutempter \
        lksctp-tools \
        quota \
        radvd \
        usbredir \
        texinfo \
        freetype \
        celt051 \
        cryptsetup \
        lmsensors-libsensors \
        lmsensors-fancontrol \
        lmsensors-isatools \
        lmsensors-pwmconfig \
        lmsensors-sensord \
        lmsensors-sensors \
        lmsensors-sensorsconfconvert \
        lmsensors-sensorsdetect \
	syslinux \
	krb5 \
	"

RDEPENDS_packagegroup-stak-ruby = " \
	ruby-shadow \
	ruby \
	"

RDEPENDS_packagegroup-stak-puppet = " \
	puppet \
	puppet-vswitch \
	"

RDEPENDS_packagegroup-stak-perl = " \
	filter-perl \
	pathtools-perl \
	podlators-perl \
	scalar-list-utils-perl \
	\
	perl-module-carp \
	perl-module-constant \
	perl-module-data-dumper \
	perl-module-encode \
	perl-module-exporter \
	perl-module-file-path \
	perl-module-file-temp \
	perl-module-getopt-long \
	perl-module-http-tiny \
	perl-module-parent \
	perl-module-pod-escapes \
	perl-module-pod-perldoc \
	perl-module-pod-simple \
	perl-module-pod-usage \
	perl-module-socket \
	perl-module-storable \
	perl-module-text-parsewords \
	perl-module-time-local \
	perl-module-time-hires \
	perl-module-threads \
	perl-module-threads-shared \
	"

RDEPENDS_packagegroup-stak-python = " \
	python-pygpgme \
	python-pyparted \
	python-coverage \
	python-docker-registry-core \
	python-flask-restful \
	python-mox3 \
	python-pexpect \
	python-ptyprocess \
	python-traceback2 \
	python-typing \
	python-ujson \
	python-yappi \
	python-hp3parclient \
	python-click \
	python-daemon \
	python-ipy \
	python-ldap \
	python-linecache2 \
	python-pep8 \
	python-pyudev \
	python-simplegeneric \
	python-slip-dbus \
	python-pytz \
	python-pymysql \
	python-pyzmq \
	python-xstatic-jquery.tablesorter \
	python-xstatic-jquery.quicksearch \
	python-xstatic-magic-search \
	python-perf \
	python-urwid \
	python-urlgrabber \
	python-semantic-version \
	python-repoze.lru \
	python-pyelftools \
	python-pycurl \
	python-lefthandclient \
	python-jwcrypto \
	python-iniparse \
	python-ethtool \
	python-jmespath \
	python-beaker \
	python-cherrypy \
	python-d2to1 \
	python-firewall \
	python-ldap3 \
	python-pyngus \
	python-pyzmq \
	python-requests-oauthlib \
	python-versiontools \
	python-dogpile.cache \
	python-dogpile.core \
	python-oslo.cache \
	python-oslo.concurrency \
	python-oslo.config \
	python-oslo.context \
	python-oslo.db \
	python-oslo.i18n \
	python-oslo.log \
	python-oslo.middleware \
	python-oslo.messaging \
	python-oslo.policy \
	python-oslo.rootwrap \
	python-oslo.serialization \
	python-oslo.service \
	python-oslo.upgradecheck \
	python-oslo.utils \
	python-oslo.versionedobjects \
	python-configobj \
	python-pyudev \
	python-six \
	python-alembic \
	python-django-debreach \
	python-google-auth \
	python-gunicorn \
	python-influxdb \
	python-ldappool \
	python-munch \
	python-aniso8601 \
	python-yaql \
	python-construct \
	python-yappi \
	python-idna \
	python-selectors34 \
	python-pymisp \
	python-scrypt \
	python-flask \
	python-itsdangerous \
	python-flask-sqlalchemy \
	python-funcsigs \
	python-requests \
	python-pymongo \
	python-pytest-tempdir \
	python-flask-migrate \
	python-robotframework \
	python-webencodings \
	python-flask-nav \
	python-lockfile \
	python-pluggy \
	python-configparser \
	python-dateutil \
	python-enum34 \
	python-monotonic \
	python-humanize \
	python-unidiff \
	python-snakefood \
	python-traceback2 \
	python-babel \
	python-jsonpatch \
	python-cmd2 \
	python-pyusb \
	python-strict-rfc3339 \
	python-robotframework-seriallibrary \
	python-sijax \
	python-click \
	python-zopeinterface \
	python-parse-type \
	python-semver \
	python-bcrypt \
	python-typing \
	python-flask-bcrypt \
	python-pynetlinux \
	python-pyasn1-modules \
	python-pyfirmata \
	python-cryptography \
	python-flask-babel \
	python-urllib3 \
	python-protobuf \
	python-slip-dbus \
	python-singledispatch \
	python-pycodestyle \
	python-blinker \
	python-beautifulsoup4 \
	python-pyalsaaudio \
	python-sh \
	python-mako \
	python-backports-abc \
	python-flask-script \
	python-flask-bootstrap \
	python-asn1crypto \
	python-pysqlite \
	python-pybind11 \
	python-greenlet \
	python-attr \
	python-daemon \
	python-pydbus \
	python-lazy-object-proxy \
	python-crcmod \
	python-pytest \
	python-pytest-runner \
	python-pandas \
	python-pyinotify \
	python-flask-wtf \
	python-daemonize \
	python-wtforms \
	python-pyiface \
	python-pretend \
	pyrtm \
	python-ipaddress \
	python-bitarray \
	python-pyflakes \
	python-snimpy \
	python-pysnmp \
	python-pyjwt \
	python-hyperlink \
	python-sdnotify \
	python-rfc3987 \
	python-vobject \
	python-serpent \
	python-mccabe \
	python-py \
	python-speaklater \
	python-intervals \
	python-flask-mail \
	python-ndg-httpsclient \
	python-wcwidth \
	python-pyparsing \
	python-pep8 \
	python-redis \
	python-psutil \
	python-grpcio-tools \
	python-flask-restful \
	python-mock \
	python-javaobj-py3 \
	python-subprocess32 \
	python-constantly \
	python-netaddr \
	python-pam \
	python-stevedore \
	python-dbusmock \
	python-matplotlib \
	python-attrs \
	python-docutils \
	python-pyopenssl \
	python-setuptools-scm \
	python-smbus \
	python-dnspython \
	python-pycparser \
	python-pyserial \
	python-imaging \
	python-pint \
	python-cython \
	python-flask-login \
	python-html5lib \
	python-flask-xstatic \
	python-chardet \
	python-flask-uploads \
	python-inflection \
	python-twofish \
	python-pytz \
	python-jsonschema \
	python-flask-user \
	python-behave \
	python-pyzmq \
	python-jinja2 \
	python-pyasn1 \
	python-pyudev \
	python-sparts \
	python-epydoc \
	python-feedparser \
	python-pyrex \
	python-progress \
	python-can \
	python-vcversioner \
	python-markupsafe \
	python-paho-mqtt \
	python-grpcio \
	python-xlrd \
	python-visitor \
	python-pyflame \
	python-jsonpointer \
	python-numeric \
	python-ptyprocess \
	python-pyperclip \
	python-wrapt \
	python-appdirs \
	python-cheetah \
	python-dbus \
	python-flask-sijax \
	python-simplejson \
	python-webdav \
	python-pip \
	python-oauthlib \
	python-flask-pymongo \
	python-sqlalchemy \
	python-django \
	python-pbr \
	python-networkx \
	python-decorator \
	python-anyjson \
	python-prompt-toolkit \
	python-pycrypto \
	python-cffi \
	python-djangorestframework \
	python-future \
	python-linecache2 \
	python-pyroute2 \
	python-parse \
	python-feedformatter \
	python-pysocks \
	python-six \
	python-alembic \
	python-pybluez \
	python-pysmi \
	python-gdata \
	python-gevent \
	python-whoosh \
	python-ujson \
	python-xstatic-font-awesome \
	python-pexpect \
	python-iso8601 \
	python-flask-navigation \
	python-pystache \
	python-lxml \
	python-prettytable \
	python-systemd \
	python-cryptography-vectors \
	python-pyhamcrest \
	python-certifi \
	python-ply \
	python-webcolors \
	python-editor \
	python-django-south \
	pamela \
	python-aws-iot-device-sdk-python \
	python-werkzeug \
	python-isort \
	python-periphery \
	python-pytest-helpers-namespace \
	python-paste \
	python-pyyaml \
	python-dominate \
	python-pygpgme \
	python-msgpack \
	python-xstatic \
	python-evdev \
	python-passlib \
	python-horizon \
	python-keyring \
	"
