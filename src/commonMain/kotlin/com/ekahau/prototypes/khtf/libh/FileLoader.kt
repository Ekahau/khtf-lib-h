package com.ekahau.prototypes.khtf.libh

import com.suparnatural.core.fs.FileSystem

internal class FileLoader {

    fun load(filePath: String): List<String> {

        return FileSystem
                .readFile(filePath)!!
                .split("\n")

    }
}