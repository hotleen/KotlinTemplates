package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-08 11:35
 * @Description:
 **/
data class LimbsInfo(var info: String, var length: Int) {
    fun show() {
        println("${info}的长度是$length")
    }
}

// 枚举类
enum class Limbs(private var limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 88)),
    RIGHT_HAND(LimbsInfo("右手", 88)),

    LEFT_FOOT(LimbsInfo("左脚", 188)),
    RIGHT_FOOT(LimbsInfo("右脚", 188));

    fun show() = "四肢是：${limbsInfo.info},长度是：${limbsInfo.length}"

    fun updateDate(limbsInfo: LimbsInfo) {
        this.limbsInfo.info = limbsInfo.info
        this.limbsInfo.length = limbsInfo.length
        println("message after update: ${this.limbsInfo}")
    }
}

fun main() {
    println(Limbs.LEFT_HAND.show())

    //更新
    Limbs.LEFT_HAND.updateDate(LimbsInfo("左手",90) )
}