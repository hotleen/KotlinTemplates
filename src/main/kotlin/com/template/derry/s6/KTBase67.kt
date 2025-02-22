package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-20 20:00
 * @Description: getOrElse 适用于list、map 可以传入lambda计算
 * getOrDefault 适用于map 及用于赋值默认值
 **/
fun main() {
    val mMap = mapOf("jack" to 21, "amy" to 22)

    //[] 方式，对[]进行了运算符重载，跟get等价，不存在key则返回null
    println(mMap["jack"])
    println(mMap["jack1"])

    //getOrDefault
    println(mMap.getOrDefault("jack", 18))
    println(mMap.getOrDefault("jack1", 18))

    //getOrElse
    println(mMap.getOrElse("jack") { 18 })
    println(mMap.getOrElse("jack1") { 18 })

    //get 不存在返回null
    println(mMap.get("jack"))
    println(mMap.get("jack1"))
}