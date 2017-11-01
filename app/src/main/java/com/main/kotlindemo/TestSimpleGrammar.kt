package com.main.kotlindemo

import android.util.Log

/**
 * 测试简单语法
 *
 * Created by shuqiao on 2017/10/30.
 */

class TestSimpleGrammar {
    val TAG: String = "TestSimpleGrammar"

    fun test() {

        log("from method test....")

        testParameter()

        testSum()

        testRange()

        testIf()

        testWhen(1)

        testWhen(8)

        testFor("apple", "orange", "milk", "sugar")

        testWhile()

        testReturn()
    }

    private fun testParameter() {
        var a: Int = 1

        var b = 999_999

        var c: String = "Hello"

        var d: String? = "23"

        var e = d?.toInt()

        d = null

        var f = d?.toInt() ?: -1

        log("a = $a, b=$b，c=$c, d=$d, e=$e, f=$f")
    }

    private fun testSum() {
        log("sum1-${sum1(1, 2)}, sum2-${sum2(1, 2)}, sum3-${sum3(1, 2)}, ${sum4(1, 2)})")
    }

    private fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    private fun sum2(a: Int, b: Int) = a + b

    private fun sum3(a: Int, b: Int) = a + b

    private var sum4: (Int, Int) -> Int = { x, y -> x + y }

    private fun testRange() {
        for (i in 1..5)
            Log.i(TAG, "age = " + i)

        for (i in 5..1)
            Log.i(TAG, "age = " + i)

        for (i in 1..5 step 2)
            Log.i(TAG, "age = " + i)

        for (i in 1 until 5)
            Log.i(TAG, "age = " + i)

        for (i in 5..1 step 2)
            Log.i(TAG, "age = " + i)

        for (i in 5 downTo 1 step 2)
            Log.i(TAG, "age = " + i)
    }

    private fun testIf() {
        var a = 1
        var b = 2

        var c = if (a > b) a else b
        log("c=" + c)

        var d: Int
        if (a > b) {
            d = a
        } else {
            d = b
        }
        log("d=" + d)

        var e = if (a > b) {
            a
            log("e=" + a)
        } else {
            b
            log("e=" + b)
        }
    }

    private fun testWhen(x: Int) {
        when (x) {
            1 -> log("x=1")
            2 -> log("x=2")
            in 3..5 -> log("x in 3..5")
            6, 7, 8, 9 -> log("x is 6,7,8,9")
            !in 10..20 -> log("x !in 10.20")
            else -> {
                log("x!=1 and x!=2")
            }
        }
    }

    private fun testFor(vararg sArray: String) {
        for (s in sArray)
            log("sArray , " + s)

        for (i in sArray.indices)
            log("sArray , $i-${sArray[i]}")
    }

    private fun testWhile() {
        var number1 = 5
        while (number1 > 5)
            log("while, number=" + number1--)

        var number2 = 5
        do {
            log("do-while, number2=" + number2--)
        } while (number2 > 5)

    }

    private fun testReturn() {
        var a = 0

        while (a++ <= 3) {
            log("testReturn , a=$a")
            var b = a + 5
            for (i in 1..b) {
                if (i < 3)
                    log("testReturn , i=$i")
                else if (i in 4..5)
                    continue
                else if (i == 7)
                    break
                else
                    log("testReturn , i=$i")
            }
        }

        var numberArray: IntArray = intArrayOf(1, 2, 3, 0, 4)

        numberArray.forEach {
            if (it == 0) {
                return
            }

            log("number = $it")
        }

        numberArray.forEach lit@ {
            if (it == 0) {
                return@lit
            }

            log("number = $it")
        }
    }

    private fun log(info: String?) {
        Log.i(TAG, info)
    }
}

