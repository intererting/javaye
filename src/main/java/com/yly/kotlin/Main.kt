package com.yly.kotlin

/**
 * @author    yiliyang
 * @date      2021/7/19 上午9:41
 * @version   1.0
 * @since     1.0
 */
//typealias func = (String) -> Int

//typealias func<T> = (T) -> T

//val a: func<Int> = { it }

fun test(): Map<String, String> {
    var result = hashMapOf<String, String>()
    try {
        result.put("value", "try")
        throw java.lang.RuntimeException("xx")
        return result
    } catch (e: Exception) {
        result.put("value", "catch")
        return result
    } finally {
        result = hashMapOf()
        result.put("value", "finally")
    }
    return result
}

fun main() {
//    val a = { a: Int -> a }
//    val b = { c: Int -> c }
//    println(a.equals(b))

    val a = hashMapOf("name" to "yuliyang")
    val result = a.also {
        a["name"] = "changed"
    }
    println(result)
    println(a)

//    println(test()["value"])
    
//    println(func(1))

//    println((::testAnnotation.annotations.get(0) as MyAnnotation).name)
//    val person = Person()
//    person.test()
//    person.test1()

//    val colorsText = "green, red , brown&blue, orange, pink&green"
//    val regex = "[,\\s]+".toRegex()
//    val mixedColor = regex.split(colorsText)
//    for (item in mixedColor) {
//        println(item)
//    }

//    val text = "1. 1"
//    val regex = "[\\s.]+".toRegex()
//    val result = text.split(regex)
//    for (item in result) {
//        println(item)
//    }
}

fun test(a: Int): Boolean {
    return a > 0
}

fun testA(a: (Int) -> Boolean): Boolean {
    return a(3)
}

interface A {
    fun test() {

        println("haha")
    }
}

interface B {
    fun test() {
        println("hihihi")
    }
}

class C : A, B {
    override fun test() {
        super<A>.test()
    }

    fun test1() {
    }

}

@MyAnnotation("test")
fun testAnnotation(runnable: () -> Unit) {

}


annotation class MyAnnotation(val name: String)

class Person {
    val lock = Any()
    fun test() {
        synchronized(lock) {
            println("test")
        }
    }

    fun test1() {
        synchronized(Person::class) {
            println("test1")
        }
    }
}