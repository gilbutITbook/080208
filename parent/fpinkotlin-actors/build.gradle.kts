plugins {
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib"))
    compile(project(":fpinkotlin-common"))
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.2.1")
    testCompile(project(":fpinkotlin-common-test"))
    testCompile("io.kotlintest:kotlintest-runner-junit5:${project.rootProject.extra["kotlintestVersion"]}")
    testRuntime("org.slf4j:slf4j-nop:${project.rootProject.extra["slf4jVersion"]}")
}