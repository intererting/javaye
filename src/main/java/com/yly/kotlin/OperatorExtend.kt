package com.yly.kotlin

/**
 * @author    yiliyang
 * @date      2021/4/14 上午10:39
 * @version   1.0
 * @since     1.0
 */
open class OperatorFather(var name: String) {

    open operator fun OperatorFather.plus(other: OperatorFather): OperatorFather {
        return OperatorFather(this.name + " father plus " + other.name)
    }
}

class OperatorSon : OperatorFather("son") {

    override fun OperatorFather.plus(other: OperatorFather): OperatorFather {
        return OperatorFather(this.name + " son plus " + other.name)
    }
}

//operator fun OperatorFather.plus(other: OperatorFather): OperatorFather {
//    return OperatorFather(this.name + " father plus " + other.name)
//}

fun main() {
    val operatorFather = OperatorSon()
    val operatorFather2 = OperatorSon()
    val composeFather = with(OperatorFather("haha")) {
        operatorFather + operatorFather2
    }
    println(composeFather.name)
}