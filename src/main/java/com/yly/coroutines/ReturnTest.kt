package com.yly.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consume
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import reactor.core.Disposable
import java.lang.Exception
import kotlin.coroutines.suspendCoroutine

/**
 * @author    yiliyang
 * @date      2022/2/25 上午10:01
 * @version   1.0
 * @since     1.0
 */
fun main() = runBlocking {
    val channel = Channel<Int> { }
    launch {
        for (data in channel) {
            println("launch 1 $data")
        }
    }
    launch {
        for (data in channel) {
            println("launch 2 $data")
        }
    }
    launch {
        repeat(1000) {
            delay(400)
            channel.send(it)
        }
    }
    delay(10000)
    return@runBlocking
}
