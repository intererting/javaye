package com.yly.concurent

import kotlinx.coroutines.yield
import java.util.concurrent.atomic.AtomicInteger

/**
 * @author    yiliyang
 * @date      2021/4/25 下午3:09
 * @version   1.0
 * @since     1.0
 */
val flag = AtomicInteger(0)

fun main() {
    thread1.start()
    thread2.start()
    thread3.start()
}

val thread1 = Thread {
    while (flag.get() < 21) {
        if (flag.get() % 3 == 0) {
            println("0")
            flag.incrementAndGet()
        }
        Thread.yield()
    }
}
val thread2 = Thread {
    while (flag.get() < 21) {
        if (flag.get() % 3 == 1) {
            println("1")
            flag.incrementAndGet()
        }
        Thread.yield()
    }
}
val thread3 = Thread {
    while (flag.get() < 21) {
        if (flag.get() % 3 == 2) {
            println("2")
            flag.incrementAndGet()
        }
        Thread.yield()
    }
}