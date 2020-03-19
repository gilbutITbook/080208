plugins {
    base
    kotlin("jvm") version "1.3.61" //apply false
}

allprojects {

    buildscript {
        extra["kotlintestVersion"] = "3.4.2"
        extra["logbackVersion"] = "1.2.3"
        extra["slf4jVersion"] = "1.7.28"
    }

    group = "com.mydomain.mymultipleproject"

    version = "1.0-SNAPSHOT"

    repositories {
        jcenter()
        mavenCentral()
    }
}
