package com.lorenzoog.vagrank.script.definition.api

sealed class Network {
    class Private(var ip: String) : Network()
    class Public(var ip: String) : Network()
    class ForwardedPort(var guest: String, var host: String) : Network()

    class Custom(var network: String, var options: Map<String, Any>) : Network()
}

inline fun <reified T : Network> Vm.network(configure: T.() -> Unit) {
    TODO()
}
