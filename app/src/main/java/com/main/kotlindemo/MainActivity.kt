package com.main.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    public val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //------------测试基本语法
        var testSimpleGrammar: TestSimpleGrammar = TestSimpleGrammar()
        testSimpleGrammar.test()

        //------------测试基本数据类型
        TestSimpleData().test()

        //------------测试类的使用
        var p1: TestPerson = TestPerson(null, null)
        p1.name = "小明"
        p1.age = 10
        p1.score = 90

        var p2: TestPerson = TestPerson("小红", -10)
        p2.score = 1000

        var p3: TestPerson = TestPerson("小狗", -10, -10)

        Log.i(TAG, p1.toString() + "\n" + p2.toString() + "\n" + p3.toString())

        //------------测试嵌套类和内部类
        TestPerson.Body().getDetail()
        TestPerson.Body().Head().getDetail()

        //------------测试继承
        var dog: Dog = Dog("Dog", 10)
        dog.eat()

        var cat: Cat = Cat(9, "white")
        cat.eat()
        cat.shout()

        //------------测试方法扩展
        fun Cat.eatFish(number: Int) {
            drink()
            Log.i(cat_tag, "Cat eat $number fishes")
        }

        cat.eatFish(5)

        //------------测试数据类
        var data1: StudentData = StudentData("小鹏鹏", 10, 10)

        var data2: StudentData = data1.copy(name = "小土豆", age = 15)

        Log.i(TAG, "data1 , name=${data1.name} , age=${data1.age} , score=${data1.score}")
        Log.i(TAG, "data2 , name=${data2.name} , age=${data2.age} , score=${data2.score}")

        //------------测试泛型
        var catBox: Box<Cat, String> = Box(Cat(10, "white"), "Cat")
        Log.i(TAG, "catBox , data=${catBox.data} , type=${catBox.type}")

        //------------测试枚举
        var signal1: SignalEnum = SignalEnum.valueOf("WAITING")
        Log.i(TAG, "signal1 , name=${signal1.name} , ordinal=${signal1.ordinal} , next=${signal1.next()}")

        //------------测试委托
        var actionPresent: ActionPresent = ActionPresent(cat)
        actionPresent.drink()
    }
}
