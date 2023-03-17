package com.yly.kotlin


/**
 * author        yiliyang
 * date          2022-07-27
 * time          下午5:01
 * version       1.0
 * since         1.0
 */
fun main() {
    test(a = {
        return@test "haha"
    }) {
        return@test false
    }
}

inline fun test(a: () -> String, b: () -> Boolean) {
    println(a())
    println(b())
}