require recipes-bsp/images/sitec-image.bb

IMAGE_INSTALL += "gtest"
IMAGE_INSTALL += "glog"

EXTRA_IMAGE_FEATURES_append = " dev-pkgs"
EXTRA_IMAGE_FEATURES_append = " staticdev-pkgs"

