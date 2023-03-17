package com.yly.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import java.lang.RuntimeException
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.resumeWithException

/**
 * @author    yiliyang
 * @date      2021/11/4 下午5:52
 * @version   1.0
 * @since     1.0
 */
fun main() = runBlocking {
    launch {
        val channel = Channel<Int>()
        channel.receive()
    }

    delay(100000)
    return@runBlocking
}



