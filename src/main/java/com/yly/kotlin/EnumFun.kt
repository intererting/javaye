package com.yly.kotlin

import com.google.common.base.Enums
import java.util.*
import javax.swing.text.View

/**
 * @author    yiliyang
 * @date      2021/4/29 下午4:50
 * @version   1.0
 * @since     1.0
 */
enum class Fruit(val code: String) {
    APPLE("apple"),
    PEAR("pear")
}

fun main() {
    var a: List<Int> = arrayListOf(1)

    val apple = EnumSet.allOf(Fruit::class.java).find {
        it.code.equals("apple")
    }
    println(apple?.code)
}

//fun test2(name: InlineName) {
//    println(name)
//}


//inline class InlineName(val name: String) {
//
//}

//inline fun <reified T : Enum<T>> requireEnumOf(clazz: Class<T>, predication: (T) -> Boolean) {
//    EnumSet.allOf(clazz).find {
//        predication(it)
//    }
//}