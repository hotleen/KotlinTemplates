package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-02 16:40
 * @Description: Kotlin  when 是一个语句，有返回值
 * kotlin.Unit 相当于Java void 无返回值
 **/

fun main() {
    checkWeekDay(3)
}

fun checkWeekDay(weekDay: Int) {
    val info = when (weekDay) {
        1 -> "今天是周一"
        2 -> "今天是周二"
        3 -> "今天是周三"
        4 -> "今天是周四"
        5 -> "今天是周五"
        6 -> "今天是周六"
        7 -> "今天是周天"
        else -> "不管了 随便嗨"
    }

    println(info)
}