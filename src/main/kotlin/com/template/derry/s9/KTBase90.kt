package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-01 22:08
 * @Description:
 **/
class Body(_bodyInfo:String) {
    val bodyInfo = _bodyInfo

    //内部类 默认情况下内部的类不能访问外部类，要增加inner修饰成为内部类才可以访问
    //外部类可以访问内部类
    inner class Heart {
        fun run() = println("心脏内部类访问身体信息：$bodyInfo")
    }
}

//不加inner，默认是嵌套类，外部类可以访问嵌套类 嵌套类不能访问外部类
class Outer {
    val outerInfo = "outer"

    //嵌套类无法访问外部类
    class Nested {
        fun output() = println("nested class can access outerInfo")
    }
}

fun main() {

    Body("isOk").Heart().run()

    Outer.Nested().output()
}