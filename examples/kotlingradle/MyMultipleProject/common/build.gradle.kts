
plugins {
    application
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")
    testCompile("io.kotlintest:kotlintest-runner-junit5:${project.rootProject.extra["kotlintestVersion"]}")
    testRuntime("org.slf4j:slf4j-nop:${project.rootProject.extra["slf4jVersion"]}")
//    testRuntime("ch.qos.logback:logback-classic:${project.rootProject.extra["logbackVersion"]}")
}