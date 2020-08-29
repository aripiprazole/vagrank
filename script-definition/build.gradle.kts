plugins {
    kotlin("jvm")
    java
}

group = "com.lorenzoog"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_1_8
java.targetCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    api(kotlin("scripting-jvm"))
    api(kotlin("scripting-dependencies"))
}
