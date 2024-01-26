package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-26 21:15
 * @Description:
 **/
class KTBase77(_name: String, val gender: Char) {
    val mName = _name

    init {
        val nameValue = _name
        println("init block: nameValue: $nameValue")
    }

    constructor(name:String,gender: Char,age:Int):this(name,gender) {
        println("second constructor $name, $gender, $age")
    }
}

/**
 * 1 main 调用次构造
 * 2 主构造val 变量
 * 3 var mName = _name
 * 4 init代码块
 */
fun main() {
    KTBase77("jack",'M',23)
}