package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-02-28 21:46
 * @Description: 接口
 *      1. 接口的成员变量和接口本身都是public open的
 *      2. 接口不能有主构造，
 *      3. 实现类不仅仅要重写接口函数，也要重写成员变量
 **/
interface IUSB {
    var usbVersionInfo: String
    var usbInsertDevice: String

    fun insertUsb(): String //插入设备
}

class Mouse(
    override var usbVersionInfo: String = "USB 3.0",
    override var usbInsertDevice: String = "鼠标插入USB"
) : IUSB {

    override fun insertUsb(): String {
        return "$usbVersionInfo,$usbInsertDevice"
    }

}

class Keyboard : IUSB {
    override var usbVersionInfo: String = " "
        get() = "USB 3.1"
        set(value) {
            field = value
        }

    override var usbInsertDevice: String = ""
        get() = "keyboard insert"
        set(value) {
            field = value
        }

    override fun insertUsb(): String = "Keyboard $usbVersionInfo, $usbInsertDevice"
}

fun main() {
    val usbMouse:IUSB = Mouse()
    println(usbMouse.insertUsb())

    val usbKeyboard:IUSB = Keyboard()
    println(usbKeyboard.insertUsb())
}