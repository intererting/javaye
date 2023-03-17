package com.yly

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @author    yiliyang
 * @date      2020/12/4 上午9:13
 * @version   1.0
 * @since     1.0
 */

private val name by lazy {
    "yuliyang"
}

private var age by Delegates.observable(3, onChange = { property, oldValue, newValue ->
    println(property.name)
    println(oldValue)
    println(newValue)
})

private var height by Delegates.vetoable(1.2f, onChange = { property, oldValue, newValue ->
    newValue > 2
})

fun main() {
//    println(age)
//    age = 10
//    println(height)
//    height = 1f
//    println(height)

    val mine = Mine()
    println(mine.myValue)
    mine.myValue = "changed"
    println(mine.myValue)
}

class Mine {
    var myValue: String by MyDelegates()
}

class MyDelegates : ReadWriteProperty<Any?, String> {

    private var value = "default"

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("thisRef  $thisRef")
        return value
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value
        println("thisRef  $thisRef")
        println("property.name   ${property.name}")
    }

}