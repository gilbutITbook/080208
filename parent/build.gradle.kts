plugins {
    kotlin("jvm") version "1.3.61"
}

allprojects {
    apply(plugin = "java")

    buildscript {
        extra["kotlintestVersion"] = "3.4.2"
        extra["logbackVersion"] = "1.2.3"
        extra["slf4jVersion"] = "1.7.28"
        extra["junitVersion"] = "5.6.0"
    }

    group = "com.fpinkotlin"

    version = "1.0-SNAPSHOT"

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter:${extra["junitVersion"]}")
    }

    repositories {
        jcenter()
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
