package me.devgabi.vagrank.script.definition.api

sealed class Provision {
    class Shell(var path: String, var args: List<String>, var privileged: Boolean) : Provision()

    class Custom(var provision: String, var options: Map<String, Any>) : Provision()
}

inline fun <reified T : Provision> Vm.provision(configure: T.() -> Unit) {
    TODO()
}