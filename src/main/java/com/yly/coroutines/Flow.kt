package com.yly.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author    yiliyang
 * @date      2021/12/22 上午10:18
 * @version   1.0
 * @since     1.0
 */
fun main() = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>()
    sharedFlow.emit(1)
    delay(100)
    launch {
        sharedFlow.collect {
            println(it)
        }
    }
    delay(100)
    sharedFlow.emit(2)
    return@runBlocking
}