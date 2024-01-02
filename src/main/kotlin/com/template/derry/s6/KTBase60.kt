package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-02 20:21
 * @Description:
 **/
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println(list)

    //第一种 for循环
    for (i in list) {
        print("element: $i")
    }

    // forEach
    list.forEach {
        print("element in forEach: $it")
    }

    list.forEachIndexed { index, i ->
        print("$index, $i")
    }

}