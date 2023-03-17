package com.yly.kotlin

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.*
import java.util.concurrent.DelayQueue
import kotlin.Comparator

fun main() {
//    val extentClass = ExtentClass()
//    extentClass.testExtend()

    //给同伴对象加扩展函数可以达到静态调用的效果
//    ExtentClass.test()

//    printClassName(Rectangle())

//    val a = listOf("aa", "b")
//    Collections.sort(a) { o1, o2 ->
//        println(o1.length - o2.length)
//        o1.length - o2.length
//    }
//    println(
//        a
//    )
//    testMutex()

    printClassName(Rectangle())

}

val mutex = Mutex()

fun testMutex() {
//    mutex.withLock {
//        println("haha")
//    }
}

interface OuterInterface {

    class InnerClass {

    }

}

//var a: Int = 0
//    set(value) {
//        field = value
//    }
//    get() = field

open class Shape

class Rectangle : Shape()

fun Shape.getName() = "Shape"

fun Rectangle.getName() = "Rectangle"

fun printClassName(s: Shape) {
    s.getName()
}


//fun ExtentClass.testExtend() {
//    println("testExtend")
//}
//
//class ExtentClass {
//
//
//    companion object {
//
//    }
//}
//
//
//fun ExtentClass.Companion.test() {
//    println("haah")
//}