package com.yly.kotlin

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import java.util.Arrays

/**
 * @author    yiliyang
 * @date      2022/4/26 上午9:35
 * @version   1.0
 * @since     1.0
 */
fun main() {
    CoroutineScope(CoroutineName("haha")).launch {
        val flow1 = flow {
            kotlinx.coroutines.delay(1000)
            emit("1")
            emit("2")
        }
        val flow2 = flow {
            kotlinx.coroutines.delay(2000)
            emit("a")
            emit("b")
        }
        val flow = combine(listOf(flow1, flow2)) {
            "${it[0]} and ${it[1]}"
        }
        flow.collectLatest {
            println(it)
        }
    }
    Thread.sleep(10000)
}
