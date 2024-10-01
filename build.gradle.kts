group = "de.sldk.mc"
version = "3.1.2-SNAPSHOT"

plugins {
    kotlin("jvm") version "2.0.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.0.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    implementation("org.eclipse.jetty:jetty-server:12.0.13")
    implementation("io.prometheus:simpleclient_common:0.16.0")
    implementation("io.prometheus:simpleclient_hotspot:0.16.0")
    implementation("com.jayway.jsonpath:json-path:2.9.0")
}

tasks {
    shadowJar {
    }
    build {
        dependsOn(shadowJar)
    }
}

kotlin {
    jvmToolchain(17)
}
