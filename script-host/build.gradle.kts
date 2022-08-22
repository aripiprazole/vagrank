plugins {
    kotlin("jvm")
}

group = "me.devgabi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":script-definition"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")

    api(kotlin("scripting-jvm-host"))
    api(kotlin("scripting-compiler-embeddable"))
}
