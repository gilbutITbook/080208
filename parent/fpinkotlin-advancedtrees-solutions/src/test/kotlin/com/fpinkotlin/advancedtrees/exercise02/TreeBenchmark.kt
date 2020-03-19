package com.fpinkotlin.advancedtrees.exercise02

import com.fpinkotlin.generators.IntListGenerator

typealias Stack<A> = com.fpinkotlin.common.List<A>
fun main(args: Array<String>) {
    println("Generating test data...")
    val list = IntListGenerator(0, 1_000_000).random().map { it.second }.first()
    print("Creating tree... ")
    val time = System.currentTimeMillis()
    val tree = list.foldLeft(Tree<Int>()) { t -> { t + it } }
    val duration = System.currentTimeMillis() - time
    println("inserted ${list.length} elements in $duration ms.")
    val time2 = System.currentTimeMillis()
    print("Emptying tree... ")
    val tree2 = list.foldLeft(tree) { t -> { t - it } }  // 원소스에서는 -가 delete여서 원소를 여러번 삭제하다 보면 오류가 발생함
    val duration2 = System.currentTimeMillis() - time2
    println("removed ${list.length} elements in $duration2 ms.")
}
