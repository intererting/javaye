package com.yly.block

/**
 * author        yiliyang
 * date          2022-09-21
 * time          下午1:56
 * version       1.0
 * since         1.0
 */
fun main() {
    println("before block");

    {
        println("block")
    }

    println("after block")
}