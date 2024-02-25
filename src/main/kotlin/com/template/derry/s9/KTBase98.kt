package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-25 18:09
 * @Description: 密封类 枚举类传递信息
 * & 乔迁大吉
 **/

sealed class ExamInfo {
    object Fraction1 : ExamInfo() //差
    object Fraction2 : ExamInfo() //及格
    object Fraction3 : ExamInfo()

    //良好
    class Fraction4(val studentName: String) : ExamInfo() //优秀
}

class TeacherInfo(private val exam: ExamInfo) {
    fun show() =
        when (exam) {
            is ExamInfo.Fraction1 -> "很差"
            is ExamInfo.Fraction2 -> "及格"
            is ExamInfo.Fraction3 -> "良好"
            is ExamInfo.Fraction4 -> "优秀,学生姓名是：${(this.exam as ExamInfo.Fraction4).studentName}"
//            else -> {} 使用枚举判断，when的else分支可以可以不加
        }
}

fun main() {
    println(TeacherInfo(ExamInfo.Fraction1).show())
    println(TeacherInfo(ExamInfo.Fraction4("jack")).show())
}