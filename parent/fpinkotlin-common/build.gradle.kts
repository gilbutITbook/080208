
plugins {
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("io.kotlintest:kotlintest-runner-junit5:${project.rootProject.extra["kotlintestVersion"]}")
    testRuntime("org.slf4j:slf4j-nop:${project.rootProject.extra["slf4jVersion"]}")
//    testRuntime("ch.qos.logback:logback-classic:${project.rootProject.extra["logbackVersion"]}")
}