package me.devgabi.vagrank.script.definition

import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.api.*
import kotlin.script.experimental.jvm.baseClassLoader
import kotlin.script.experimental.jvm.jvm

class VagrankEvaluationConfiguration : ScriptEvaluationConfiguration({
    jvm {
        baseClassLoader(VagrankScript::class.java.classLoader)
    }
})

class VagrankCompilationConfiguration : ScriptCompilationConfiguration({
    defaultImports(DefaultImports)

    jvm {
        compilerOptions("-jvm-target=1.8")
    }

    ide {
        acceptedLocations(ScriptAcceptedLocation.Everywhere)
    }
})

@KotlinScript(
    displayName = "Vagrank script",
    fileExtension = FileExtension,
    compilationConfiguration = VagrankCompilationConfiguration::class,
    evaluationConfiguration = VagrankEvaluationConfiguration::class
)
abstract class VagrankScript {

    fun toYaml(): String = TODO()

}