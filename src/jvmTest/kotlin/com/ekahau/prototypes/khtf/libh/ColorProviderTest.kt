package com.ekahau.prototypes.khtf.libh

import org.junit.jupiter.api.Test

class ColorProviderTest {

    @Test
    fun testFileLoad() {
        ColorProviderFactory.initialPathToFile = javaClass.getClassLoader().getResource("libh/colors.txt").path

        println(ColorProviderFactory.colorProvider.getVal("red"))
    }



}