package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-01 20:29
 * @Description:
 **/

interface IUSB2 {
    val usbVersionInfo:String
        get() = (1..100).shuffled().last().toString()

    val usbInsertDevice:String
        get() = "高级设备插入"

    fun insertUsb():String

}

class Keyboard2 : IUSB2 {
    override val usbVersionInfo: String
        get() = super.usbVersionInfo

    override val usbInsertDevice: String
        get() = super.usbInsertDevice

    override fun insertUsb(): String = "Keyboard $usbVersionInfo, $usbInsertDevice"
}

fun main() {
    val keyboard:IUSB2 = Keyboard2()
    println(keyboard.insertUsb())
}