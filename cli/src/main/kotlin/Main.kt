package me.devgabi.vagrank.cli

import me.devgabi.vagrank.script.host.ScriptCompiler
import java.io.File

val compiler = ScriptCompiler()

suspend fun main(args: Array<String>) {
    val script = compiler.compileScript(File("testingfile.vagrankfile.kts"))

    println(script.toYaml())
}