package com.main.kotlindemo

/**
 * Created by shuqiao on 2017/10/31.
 */
enum class SignalEnum(signal: Int) {
    WAITING(0) {
        override fun next(): Int {
            return 1
        }
    },
    START(1) {
        override fun next(): Int {
            return 2
        }
    },
    PAUSE(2) {
        override fun next(): Int {
            return 3
        }
    },
    RESTART(3) {
        override fun next(): Int {
            return 4
        }
    },
    STOP(4) {
        override fun next(): Int {
            return 0
        }
    },
    ERROR(5);

    open fun next(): Int {
        return -1
    }
}