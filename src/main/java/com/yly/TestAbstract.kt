package com.yly

abstract class TestAbstract {
    abstract fun test()
    abstract val a: Int

}

class Son : TestAbstract() {
    override fun test() {

    }

    override val a: Int = System.currentTimeMillis().toInt()

}