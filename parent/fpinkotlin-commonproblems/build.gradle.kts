plugins {
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib"))
    compile(project(":fpinkotlin-common"))
    compile("org.jdom:jdom2:2.0.6")
    testCompile(project(":fpinkotlin-common-test"))
    testCompile("io.kotlintest:kotlintest-runner-junit5:${project.rootProject.extra["kotlintestVersion"]}")
    testRuntime("org.slf4j:slf4j-nop:${project.rootProject.extra["slf4jVersion"]}")
}