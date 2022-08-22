package me.devgabi.vagrank.script.definition.api

sealed class VagrankVersion

class Vagrank3(val vm: Vm) : VagrankVersion() {
    fun vm(configure: Vm.() -> Unit) {
        TODO()
    }
}

@Suppress("FunctionName")
inline fun <reified T : VagrankVersion> Vagrank(configure: T.() -> Unit) {
    TODO()
}

/** TO BE REMOVED */
fun main() {
    Vagrank<Vagrank3> {
        vm {
            box = "Some box name"
            boxUrl = "url haha"

            ssh {

            }

            network<Network.Private> {
                ip = "some ip"
            }

            provider<Provider.VirtualBox> {
                name = "SOME VM NAME HAHA"
                memory = 24214
                cpus = 8
            }
            provision<Provision.Shell> {
                path = "idk"
                args = listOf("IDK")
                privileged = true
            }

            syncedFolder(
                path = ".",
                targetPath = "some path cool",
                create = true,
                owner = "vagrant",
                group = "vagrant",
                mountOptions = listOf(
                    "dmode" to "775",
                )
            )
        }
    }
}