package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-16 16:51
 * @Description: 匿名函数和具名函数
 **/

fun main() {

    //匿名函数
    showPersonInfo("tom", 18) {
        println(it)
    }

    //具名函数参数
    showPersonInfo("jack", 19, ::showResultImpl)


}

fun showResultImpl(result: String) {
    println(result)
}

inline fun showPersonInfo(name: String, age: Int, showResult: (String) -> Unit) {
    val info = "name:$name, age:$age"
    showResult(info)
}