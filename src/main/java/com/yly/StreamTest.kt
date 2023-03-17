package com.yly

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoField
import java.util.*
import java.util.function.BiConsumer
import java.util.function.Consumer
import java.util.function.Predicate
import java.util.function.Supplier
import java.util.stream.Collectors
import java.util.stream.LongStream
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * @author    yiliyang
 * @date      2020/12/3 下午2:39
 * @version   1.0
 * @since     1.0
 */
fun main() {

    val list = listOf(1, 2, 3)

    println(
        list.stream().parallel().collect<MutableList<Int>>(
            ::ArrayList,
            { t, u -> t.add(u) },
            { t, u -> t.addAll(u) },
        )
    )
//
//    label@ for (i in 0..2) {
//        if (i == 1) {
//            continue@label
//        }
//        println(i)
//    }

//    val formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
//    println(formater.format(LocalDate.now()))
}