package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-02 9:26
 * @Description:
 **/
class KTBase104<T>(private val isReturn: Boolean, private val obj: T) {
    fun getObj() = obj.takeIf { isReturn }
}

fun main() {
    val s1 = Student("jack", 18, 'M')

    println(KTBase104(true, s1).getObj())
    println(KTBase104(false , s1).getObj())
}