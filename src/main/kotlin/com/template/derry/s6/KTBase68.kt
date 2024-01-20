package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-20 20:34
 * @Description: map遍历
 **/
fun main() {
    val mMap = mapOf("jack" to 21, "amy" to 22, "frank" to 23)

    mMap.forEach {
        println("map key:${it.key} & value:${it.value}")
    }

    mMap.forEach { k, v ->
        println("map key:$k & value:$v")
    }

    mMap.forEach { (k, v) ->
        println("map key:$k & value:$v")
    }

    for (item in mMap) {
        println("map key:${item.key} & value:${item.value}")
    }

}