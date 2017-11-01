package com.main.kotlindemo

import android.util.Log

/**
 * Created by shuqiao on 2017/10/31.
 */
class Dog : BaseAnimal {

    constructor() : super("Dog") {

    }

    constructor(name: String, age: Int) : super(name, age) {

    }

    override fun eat() {
        Log.i(TAG, "Dog , eat")
    }
}