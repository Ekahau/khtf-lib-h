package com.ekahau.prototypes.khtf.libh

/**
 * Simple class that wrap map
 */
class ColorProvider(values: Map<String, String>) {

    private val colorMap: MutableMap<String, String>


    init {
        colorMap = HashMap(values)
    }

    fun getVal(key: String): String? {
        return colorMap[key]
    }

    fun putVal(key: String, value: String) {
        colorMap[key] = value
    }

}