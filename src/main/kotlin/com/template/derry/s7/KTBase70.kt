package com.template.derry.s7

import java.util.*

/**
 * author: jack hu
 * @Create: 2024-01-23 22:33
 * @Description:
 **/

class KTBase70 {
    var name = "jack"
    /**
     * 隐式代码
     * private string name = "jack"
     * public getName ...
     * public setName
     */

    var value = "abc"
    // 隐式代码 不写也会有
//    get() = field
//    set(value) {
//        field = value
//    }

    // set get 做扩展可以
    // field有点类似于this 不过指向的是成员变量
    var info = "kotlin is good"
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        set(value) {
            field = "**[$value]**"
        }

}

fun main() {
    //实际调用的get/set
    KTBase70().name = "kevin"
    println(KTBase70().name)

    println(KTBase70().info)
    val obj = KTBase70()
    obj.info = "kotlin extension"
    println(obj.info)
}