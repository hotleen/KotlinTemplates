package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-25 20:30
 * @Description: 主构造器可以通过val name：string方式，也可以通过普通参数_name:string方式
 * val name:string方式相当于在类里面也定义了这个变量，不需要向普通参数那样手动赋值
 * 注意次构造器只能使用普通参数_name:string 手动赋值
 **/
// 跟_xxx方式等价
class KTBase73(var name: String, val gender: Char, val age: Int, var info: String) {
    fun show() {
        println(name)
    }
}

fun main() {
    KTBase73(name = "tom", gender = 'M', age = 21, info = "learning Kotlin for 2.5 years").show()
}