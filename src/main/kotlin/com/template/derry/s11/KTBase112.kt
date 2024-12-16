package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2024-12-16 21:19
 * @Description:reified关键字
 **/

data class ObjectClass1(val name: String, val age: Int, val study: String)
data class ObjectClass2(val name: String, val age: Int, val study: String)
data class ObjectClass3(val name: String, val age: Int, val study: String)

class KTBase112 {

    // 默认随即输出一个对象，如果此对象和用户不一致，启用备用对象，否则就直接返回对象
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T): T? {
        val objList: List<Any> = listOf(
            ObjectClass1("tom", 22, "C"),
            ObjectClass2("jack", 23, "C#"),
            ObjectClass3("amy", 24, "C++")
        )

        val randomObj: Any? = objList.shuffled().first()
        println("您随机产生的对象是：$randomObj")
        //reified 提供泛型类型判断能力,解决Java泛型擦除无法运行时判断类型问题
        return randomObj.takeIf { it is T } as T?
        // 如果it随机产生的对象不是指定T类型，就会走备用环节
            ?: defaultLambdaAction()
    }

}

fun main() {
    val finalResult = KTBase112().randomOrDefault<ObjectClass2> {
        println("进入备用逻辑")
        ObjectClass2("sheldon", 21, "physics")
    }
    println("最终结果是 $finalResult")
}