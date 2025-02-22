package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-25 19:49
 * @Description:
 *
 *  执行顺序：1、主构造器参数初始化（先赋值给 val / var 属性）
2️⃣          2、init 代码块（从上到下依次执行）
3️⃣          3、次构造器代码（如果有）
 **/
// 主构造函数 规范来说 都是增加_xxx的方式 临时的输入类型 不能直接用 需要接收下来 成为变量才能用
// _name 等等 都是临时类型 不能直接用 需要转换接收才能用
class KTBase72(_name: String, _gender: Char, _age: Int, _info: String) {
    var name = _name
        get() = field // get不允许私有化
        private set(value) {
            field = value
        }

    val gender = _gender //接收后才能用
        get() = field //只读val变量 不能定义set函数

    val age = _age

    var info = _info

    init {
        println("init 代码块执行")
    }

    //次构造器在调用主构造器
    constructor(_name: String, _gender: Char, _age: Int, _info: String, _address:String): this(_name, _gender, _age, _info) {
        println("次构造器执行")
    }

    //init方法可以定义多个
    init {
        println("第二个 init 代码块执行")
    }





    fun show() {
        println(name)
    }
}

fun main() {
    val p = KTBase72(_name = "jack", _gender = 'M', _age = 19, _info = "learning Kotlin for 2 years", _address = "shanghai")
    p.show()
}