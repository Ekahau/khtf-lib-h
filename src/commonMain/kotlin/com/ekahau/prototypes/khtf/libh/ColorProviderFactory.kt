package com.ekahau.prototypes.khtf.libh

import kotlin.native.concurrent.ThreadLocal

/**
 * Provide default service for convenience
 */
@ThreadLocal
object ColorProviderFactory {

    //will not be used after initialized
    lateinit var initialPathToFile: String

    val colorProvider: ColorProvider by lazy {
        val map = loadDataFromFs()
        ColorProvider(map)
    }

    private fun loadDataFromFs(): Map<String, String> {

        val map = mutableMapOf<String, String>()

        FileLoader().load(initialPathToFile).forEach {
            val pair = it.split(",")
            map[pair[0]] = pair[1]
        }

        return map
    }
}