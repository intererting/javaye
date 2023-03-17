package com.yly.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.io.IOException
import java.lang.Exception
import java.lang.RuntimeException
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

/**
 * @author              yiliyang
 * @date      2020/11/2 上午10:15
 * @version   1.0
 * @since 1.0
 */
fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {
    val job = launch {
        throw RuntimeException("haha")
    }
    delay(2000)
    job.join()
//    supervisorScope {
//        launch {
//            repeat(10) {
//                delay(1000)
//                println("repeat")
//            }
//        }
//        launch {
//            delay(2000)
//            throw IOException("haha")
//        }
//
//    }

//    val handler1 = CoroutineExceptionHandler { _, exception ->
//        println("CoroutineExceptionHandler 1 got ${exception.message}")
//    }
//    val handler2 = CoroutineExceptionHandler { _, exception ->
//        println("CoroutineExceptionHandler 2 got ${exception.message}")
//    }
//    val supervisorJob = SupervisorJob()
//    val coroutineScope = CoroutineScope(supervisorJob + CoroutineName("x"))
//
//    val job = coroutineScope.launch(handler1) {
//        launch {
//            launch(handler2) {
//                delay(2000)
//                throw IOException("haha")
//            }
//        }
//    }

//    val job2 = coroutineScope.launch(handler2) {
//        launch {
//            launch {
//                delay(3000)
//                throw IOException("hehe")
//            }
//        }
//    }
//    job.join()
//    job2.join()

//    val supervisorJob = SupervisorJob()
//    val coroutineScope = CoroutineScope(supervisorJob)
//
//    val job = coroutineScope.launch {
//        launch {
//            repeat(10) {
//                delay(1000)
//                println("repeat")
//            }
//        }
//        launch {
//            delay(2000)
//            throw IOException()
//        }
//    }
//    job.join()
//

//    val job = GlobalScope.launch(handler) {
//        val inner = launch { // all this stack of coroutines will get cancelled
//            throw IOException() // the original exception
//        }
//        try {
//            inner.join()
//        } catch (e: CancellationException) {
//            println("Rethrowing CancellationException with original cause")
////            throw e // cancellation exception is rethrown, yet the original IOException gets to the handler
//        }
//    }
//    job.join()

//    val job = SupervisorJob()
//
//
//    val outterJob = CoroutineScope(job + CoroutineName("outer")).launch {
//        CoroutineScope(job + CoroutineName("inner")).launch {
//            repeat(100) {
//                delay(1000)
//                println("inner")
//            }
//        }
//    }
//
//    delay(3000)
//    job.cancel()
//    delay(5000)
//    println("finish")


//sampleStart
//    val time = measureTimeMillis {
//        simple()
//                .collect {
//                    delay(300) // pretend we are processing it for 300 ms
//                    println(it)
//                }
//    }
//    println("Collected in $time ms")
//sampleEnd


//    (0..5).asFlow().map {
//        delay(100)
//        it
//    }.conflate().collect {
//        println("conflate $it")
//        delay(3000)
//        println(it)
//    }
}