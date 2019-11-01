package com.ekahau.prototypes.khtf.libh

class PlatformColorProvider {

    private val colorProvider = ColorProviderFactory.colorProvider

    /**
     * Will call platform specific implementation, so result will be different on each platform.
     */
    fun addPlatformSpecificColor() {
        colorProvider.putVal("platform",PlatformSpecificUtil().getColor())

    }
}