package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-25 19:49
 * @Description:
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



    fun show() {
        println(name)
    }
}

fun main() {
    val p = KTBase72(_name = "jack", _gender = 'M', _age = 19, _info = "learning Kotlin for 2 years")
    p.show()
}