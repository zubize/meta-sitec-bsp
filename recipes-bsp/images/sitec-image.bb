require recipes-core/images/core-image-minimal.bb

PR = "r5"

IMAGE_INSTALL += "packagegroup-core-ssh-openssh"
IMAGE_INSTALL += "iproute2"
IMAGE_INSTALL += "binutils"
IMAGE_INSTALL += "nano"
IMAGE_INSTALL += "mtd-utils"
IMAGE_INSTALL += "mtd-utils-ubifs"
IMAGE_INSTALL += "canutils"
IMAGE_INSTALL += "vbusenable"
IMAGE_INSTALL += "flashubi"
IMAGE_INSTALL += "wireless-tools"
IMAGE_INSTALL += "wpa-supplicant"
IMAGE_INSTALL += "wpa-supplicant-cli"
IMAGE_INSTALL += "wpa-supplicant-passphrase"
IMAGE_INSTALL += "iw"
IMAGE_INSTALL += "curl"
IMAGE_INSTALL += "binutils"
IMAGE_INSTALL += "bash"
IMAGE_INSTALL += "cellularctl"
IMAGE_INSTALL += "ppp"
IMAGE_INSTALL += "ppp-configuration"
IMAGE_INSTALL += "gpsd"
IMAGE_INSTALL += "gdbserver"
IMAGE_INSTALL += "openssh-sftp-server"
IMAGE_INSTALL += "usbutils"
IMAGE_INSTALL += "bsp-version"
