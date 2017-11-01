package com.main.kotlindemo

import android.util.Log

/**
 * 类的创建
 *
 * Created by shuqiao on 2017/10/31.
 */
class TestPerson constructor(var name: String?, var age: Int?) {
    private val TAG: String = "TestPerson"

    private val DEFAULT_NAME: String = "NO_NAME"
    private val DEFAULT_AGE: Int = 1
    private val DEFAULT_SCORE: Int = 0

    init {
        if (name == null)
            name = DEFAULT_NAME

        if (age == null || age!!.toInt() < 0)
            age = DEFAULT_AGE

        Log.i(TAG, "init , " + toString())
    }

    constructor(name: String?, age: Int?, score: Int?) : this(name, age) {
        if (score != null || score!! < 0 || score!! > 100)
            this.score = score
        else
            this.score = DEFAULT_SCORE
    }

    var score: Int = 0
        get
        set(value) {
            field =
                    if (value < 0)
                        0
                    else if (value > 100)
                        100
                    else
                        value
        }

    override fun toString(): String {
        return "name-$name , age-$age , score-$score"
    }

    class Body {
        var TAG: String = "Body"

        fun getDetail() {
            Log.i(TAG, "Body getDetail...")
        }

        inner class Head {
            fun getDetail() {
                Log.i(TAG, "Header getDeatil, inner " + TAG)
            }
        }
    }
}