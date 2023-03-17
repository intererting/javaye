package com.yly.kotlin

/**
 * author        yiliyang
 * date          2022-07-27
 * time          下午5:55
 * version       1.0
 * since         1.0
 */
class MyJvmOverloads @JvmOverloads constructor(
    var name: String = "haha",
    var age: Int = 100,
    var height: Double = 200.0
) {

}