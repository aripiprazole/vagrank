package com.lorenzoog.vagrank.cli

import com.lorenzoog.vagrank.script.host.ScriptCompiler
import java.io.File

val compiler = ScriptCompiler()

suspend fun main(args: Array<String>) {
    val script = compiler.compileScript(File("testingfile.vagrankfile.kts"))

    println(script.toYaml())
}