package com.main.kotlindemo

import android.util.Log

/**
 * 测试基本数据类型
 *
 * Created by shuqiao on 2017/10/30.
 */
class TestSimpleData {
    val TAG: String = "TestSimpleData"

    public fun test() {
        testEquals()

        testArray()
    }

    private fun testEquals() {
        val a: Int = 10000
        val a1: Int = a
        val a2: Int = a

        log("a==a1? ${a == a1} , a1==a2? ${a1 == a2}")
        log("a===a1? ${a === a1} , a1===a2? ${a1 === a2}")
        log("a eauqls a1? ${a.equals(a1)} , a1 equals a2? ${a1.equals(a2)}")

        var b: String = "haha"
        var b1 = b
        var b2 = b

        log("b==b1? ${b == b1} , b1==b2? ${b1 == b2}")
        log("b===b1? ${b === b1} , b1===b2? ${b1 === b2}")
        log("b eauqls b1? ${b.equals(b1)} , b1 equals b2? ${b1.equals(b2)}")
    }

    private fun testArray() {
        var array1: IntArray = intArrayOf(1, 2, 3, 4, 5)
        var array2 = Array(5, { i -> i + 1 })
        var s: String = """
            |Hi
            |I am a girl
            """
        for (i1 in array1)
            log("array1 , " + i1)

        for (i2 in array2)
            log("array2 , " + i2)

        for (c in s.trimMargin())
            log("s , " + c)
    }

    private fun log(info: String?) {
        Log.i(TAG, info)
    }
}

