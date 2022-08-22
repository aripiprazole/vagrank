package me.devgabi.vagrank.script.host

import me.devgabi.vagrank.script.definition.VagrankScript
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.withContext
import java.io.File

interface ScriptCompiler {
    suspend fun compileScript(file: File): VagrankScript
}

@Suppress("FunctionName")
fun ScriptCompiler(): ScriptCompiler = ScriptCompilerImpl()

internal class ScriptCompilerImpl : ScriptCompiler {
    private val context = SupervisorJob() + CoroutineName("vagrank-compiler")
    private val scope = CoroutineScope(context)

    override suspend fun compileScript(file: File): VagrankScript {
        return withContext(context) {
            TODO()
        }
    }
}
