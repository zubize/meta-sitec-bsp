require recipes-core/images/core-image-minimal.bb

PR = "r1"

IMAGE_INSTALL += "mtd-utils-ubifs"
IMAGE_INSTALL += "mtd-utils"
IMAGE_INSTALL += "usbnet"
IMAGE_INSTALL += "u-boot-imx-fw-utils"
IMAGE_INSTALL += "iproute2"
IMAGE_INSTALL += "packagegroup-core-ssh-openssh"
IMAGE_INSTALL += "vbusenable"
IMAGE_INSTALL += "kernel-image"
IMAGE_INSTALL += "kernel-devicetree"
