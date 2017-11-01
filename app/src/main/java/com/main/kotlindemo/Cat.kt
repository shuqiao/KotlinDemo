package com.main.kotlindemo

import android.util.Log

/**
 * Created by shuqiao on 2017/10/31.
 */
class Cat(age: Int, color: String) : BaseAnimal("Cat", age), Action {
    var cat_tag: String = "cat_log"
    override var LOCAL_TAG: String = "Cat"

    override fun drink() {
        Log.i(LOCAL_TAG, "Cat , drink")
    }

    override fun eat() {
        super<BaseAnimal>.eat()

        super<Action>.eat()

        Log.i(LOCAL_TAG, "Cat , eat")
    }

    override fun shout() {
        super.shout()

        Log.i(LOCAL_TAG, "Cat , shout")
    }
}