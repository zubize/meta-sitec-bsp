require recipes-bsp/images/sitec-image.bb

PR = "r1"

IMAGE_INSTALL += "gtest"
IMAGE_INSTALL += "gcc"
IMAGE_INSTALL += "make"
IMAGE_INSTALL += "gtest"
IMAGE_INSTALL += "glog"
IMAGE_INSTALL += "boost"
IMAGE_INSTALL += "bc"
IMAGE_INSTALL += "vim"
IMAGE_INSTALL += "openjre-8"
IMAGE_INSTALL += "mosquitto"
IMAGE_INSTALL += "azure-iot-sdk"
IMAGE_INSTALL += "python3-azure-iot-sdk"
IMAGE_INSTALL += "python3"
IMAGE_INSTALL += "python3-simplejson"
IMAGE_INSTALL += "python-simplejson"

EXTRA_IMAGE_FEATURES_append = " dev-pkgs"
EXTRA_IMAGE_FEATURES_append = " staticdev-pkgs"
