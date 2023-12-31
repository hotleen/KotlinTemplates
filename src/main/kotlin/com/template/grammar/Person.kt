package com.template.grammar

/**
 * author: jack hu
 * @Create: 2023-11-30 23:10
 * @Description:
 **/

/**
 * 用户基类
 * 如果一个类要被继承，可以使用 open 关键字进行修饰
 * **/
open class Person(name: String) {
    /**次级构造函数**/
    constructor(name: String, age: Int) : this(name) {
        //初始化
        println("-------基类次级构造函数---------")
    }
}

/**子类继承 Person 类**/
class Student : Person {

    /**次级构造函数**/
    constructor(name: String, age: Int, no: String, score: Int) : super(name, age) {
        println("-------继承类次级构造函数---------")
        println("学生名： $name")
        println("年龄： $age")
        println("学生号： $no")
        println("成绩： $score")
    }
}

fun main(args: Array<String>) {
    var s = Student("Runoob", 18, "S12345", 89)
}
