package com.yly.coroutines

import kotlinx.coroutines.*
import java.util.concurrent.LinkedBlockingDeque
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.TimeUnit

/**
 * @author    yiliyang
 * @date      2021/11/2 下午4:16
 * @version   1.0
 * @since     1.0
 */
fun main() = runBlocking {
    val job = launch(Dispatchers.IO) {
        val queue = LinkedBlockingQueue<String>()
        val obj = queue.poll(4000, TimeUnit.MILLISECONDS)
        println(isActive)
        println("after take $obj")
    }
    delay(1000)
    job.cancel()
    println("after cancel")
}