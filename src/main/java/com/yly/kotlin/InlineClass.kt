package com.yly.kotlin

/**
 * author        yiliyang
 * date          2022-09-22
 * time          上午10:10
 * version       1.0
 * since         1.0
 */
fun main() {
    println(String.format("%04d", 2))
}

fun getM(): () -> Int {
    var a = 3
    val b = {
        a++
    }
    a++
    return b
}

fun String.test() {
    println(this.length)
}