package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-21 21:10
 * @Description:
 **/

enum class Exam {
    Fraction1, //差
    Fraction2, //及格
    Fraction3, //良好
    Fraction4 //优秀
}

class Teacher(private val exam: Exam) {
    fun show() =
        when (exam) {
            Exam.Fraction1 -> "很差"
            Exam.Fraction2 -> "及格"
            Exam.Fraction3 -> "良好"
            Exam.Fraction4 -> "优秀"
//            else -> {} 使用枚举判断，when的else分支可以可以不加
    }
}

fun main() {
    println(Teacher(Exam.Fraction2).show())
}