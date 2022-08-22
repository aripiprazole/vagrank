plugins {
    kotlin("jvm")
}

group = "me.devgabi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://kotlin.bintray.com/kotlinx")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3")

    implementation(project(":script-host"))
}
