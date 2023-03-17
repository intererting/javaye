package com.yly.coroutines

import kotlinx.coroutines.*
import java.lang.RuntimeException
import java.math.BigInteger
import kotlin.coroutines.CoroutineContext

/**
 * @author    yiliyang
 * @date      2021/5/11 下午4:39
 * @version   1.0
 * @since     1.0
 */
//测试一个协程里打开另一个协程，外层协程关闭，另一个协程运行情况(不会影响)
fun main() = runBlocking {
    val exceptionHandler = CoroutineExceptionHandler { _, t ->
        println(t)
    }

    val scope1 = CoroutineScope(CoroutineName("default_1"))
    val scope2 = CoroutineScope(CoroutineName("default_2") + exceptionHandler)
    scope1.launch {
        scope2.launch {
//            repeat(100) {
//                delay(1000)
//                println("inner")
//            }
            throw RuntimeException("exception")
        }
        repeat(100) {
            delay(1000)
            println("outer")
        }
    }
    Thread.sleep(4000)
    println("scope1 cancelx")
    scope1.cancel()
    Thread.sleep(4000)
}