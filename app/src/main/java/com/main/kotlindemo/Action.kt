package com.main.kotlindemo

import android.util.Log

/**
 * Created by shuqiao on 2017/10/31.
 */
interface Action {
    var LOCAL_TAG: String

    fun eat() {
        Log.i(LOCAL_TAG, "Action eat")
    }

    fun shout() {
        Log.i(LOCAL_TAG, "Action shout")
    }

    fun drink()

    fun sing() {}
}