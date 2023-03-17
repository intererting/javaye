package com.yly.extend

/**
 * @author    yiliyang
 * @date      2021/3/1 下午4:05
 * @version   1.0
 * @since     1.0
 */
class KotlinSon : KotlinFather() {

    override var a: Int
        get() = super.a
        set(value) {
            super.a = value + 1
        }
}