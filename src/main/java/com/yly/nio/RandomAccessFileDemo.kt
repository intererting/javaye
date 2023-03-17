package com.yly.nio

import java.io.RandomAccessFile

/**
 * @author    yiliyang
 * @date      2021/3/29 下午4:37
 * @version   1.0
 * @since     1.0
 */

fun main() {
    val rFile = RandomAccessFile("/home/yuliyang/Desktop/test.txt", "rw")
    rFile.seek(2)
    rFile.writeBytes("haha")
    rFile.close()
}