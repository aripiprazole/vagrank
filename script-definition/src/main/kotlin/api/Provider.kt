package com.lorenzoog.vagrank.script.definition.api

sealed class Provider {
    class VirtualBox(var name: String, var memory: Long, var cpus: Int) : Provider()

    class Custom(var provider: String, var options: Map<String, Any>) : Provider()
}

inline fun <reified T : Provider> Vm.provider(configure: T.() -> Unit) {
    TODO()
}
