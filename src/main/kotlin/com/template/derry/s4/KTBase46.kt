package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-20 21:19
 * @Description:
 **/
fun main() {
    /**
     * == 值/内容的比较 相当于equals
     * === 引用的比较
     */

    val name1 = "tom"
    val name2 = "tom"
    println("name1==name2: ${name1==name2}")
    println("name1===name2: ${name1===name2}")

    val name3 = name1.capitalize()
    println("name1==name3: ${name1==name3}")
    println("name1===name3: ${name1===name3}")


}