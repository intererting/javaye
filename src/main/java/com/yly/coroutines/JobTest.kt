package com.yly.coroutines

import kotlinx.coroutines.*

/**
 * @author    yiliyang
 * @date      2021/11/3 下午4:56
 * @version   1.0
 * @since     1.0
 */
fun main() = runBlocking {
    val job1 = Job()
    val job2 = Job()
    val scope = CoroutineScope(job1)
    scope.launch {
        launch() {
            repeat(100) {
                delay(2000)
                println("loop")
            }
        }
        repeat(100) {
            delay(1000)
            println("outer loop")
        }
    }
    delay(5000)
    job1.cancel()
    delay(111111111)
    return@runBlocking
}