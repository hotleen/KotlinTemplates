package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-02 16:28
 * @Description: in range表达式
 **/

fun main() {
    checkScore(82)

    checkScore(52)
}

fun checkScore(score: Int) {
    if (score in 0..59) {
        println("不及格")
    } else if (score in 60..80) {
        println("考试及格！")
    } else if (score in 81..100) {
        println("考试成绩优秀！")
    } else if (score !in 0..100) {
        println("成绩不合法！")
    }
}