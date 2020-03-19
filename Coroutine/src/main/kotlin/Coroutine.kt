import kotlinx.coroutines.*

fun main(args: Array<String>) {
    (1..10000).forEach {
        GlobalScope.launch {
            println("$it - print on thread ${Thread.currentThread().name}")
        }
    }
    println("waiting on thread ${Thread.currentThread().name}")
    Thread.sleep(10000)
    println("Finishing thread ${Thread.currentThread().name}")
}