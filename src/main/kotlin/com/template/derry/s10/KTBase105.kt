package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-02 10:03
 * @Description:
 **/
class KTBase105<T>(val isMap: Boolean = false, val inputType: T) {
    //模仿rxJava T是要变换的类型 R是转换后的类型
    //要求返回R?
    //使用了lambda 声明为内联
    inline fun <R> map(mapAction: (T) -> R) :R?= mapAction(inputType).takeIf { isMap }
}

fun main() {
    val r = KTBase105(isMap = true, inputType = 9876)
        .map {
            it.toString()
        }

    println(r)
    println(r is String)
}