package com.yly.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.flow.*
import java.lang.RuntimeException
import java.nio.file.Files
import java.nio.file.OpenOption
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 * @author    yiliyang
 * @date      2021/10/8 上午11:25
 * @version   1.0
 * @since     1.0
 */
fun main() = runBlocking {

//    flowOf(1, 2, 3).map {
//        if (it == 2) {
//            throw RuntimeException("error")
//        }
//        it
//    }.retryWhen { cause, attempt ->
//        emit(0)
//        attempt < 2
//    }.collect {
//        println("collect $it")
//    }
    return@runBlocking
}