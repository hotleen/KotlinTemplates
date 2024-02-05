package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-05 21:52
 * @Description:
 **/
data class KTBase92(var name:String, var age:Int) {

    var coreInfo : String = ""

    init {
        println("primary constructor was called")
    }

    //次构造
    constructor(name: String):this(name,21) {
        coreInfo = "core msg"
        println("add core msg")
    }

    override fun toString(): String {
        return "toString name:$name, age:$age, coreInfo:$coreInfo"
    }

}

fun main() {
    val p1 = KTBase92("jerry")
    println(p1)

    // copy调用的主构造 次构造内容需要单独考虑
    val p2 = p1.copy(name = "jack", age = 23)
    println(p2)
}