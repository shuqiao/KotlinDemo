package com.main.kotlindemo

import android.util.Log

/**
 * Created by shuqiao on 2017/10/31.
 */
open class BaseAnimal(name: String?) {
    var TAG: String = "BaseAnimal"

    constructor(name: String?, age: Int?) : this(name) {

    }

    open fun eat() {
        Log.i(TAG, "BaseAnimal , eat")
    }
}