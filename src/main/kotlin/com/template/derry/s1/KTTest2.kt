package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2024-07-28 15:51
 * @Description:
 **/

fun main() {
//    printPhoneInfo()
//    getModelFromInput()
//    testPersonArray()
    testPersonMap()
}

fun printPhoneInfo() {
    val phoneModelMap = mapOf(
        "redMi" to 1999, "honor" to 2599, "iphone14Pro" to 5999,
        "xiaomi14" to 4599, "huaweiMate60" to 6999, "iqoo" to 2499, "oppo" to 3999, "vivo" to 3499
    )
    val sortedMap = phoneModelMap.toList().sortedBy { (_, value) -> value }.toMap()
    for ((model, price) in sortedMap) {
        println("$model -> $price")
    }

    val randomThreeList = phoneModelMap.toList().shuffled().take(3);
    for ((key, _) in randomThreeList) {
        println(key)
    }
}

fun getModelFromInput() {
    println("请输入价格区间最小值:")
    val input1 = readLine() ?: ""  // 从控制台读取第一个输入

    println("请输入价格区间最大值:")
    val input2 = readLine() ?: ""  // 从控制台读取第二个输入

    println("输入的价格区间是: $input1 和 $input2")

    try {
        val priceMin = input1?.toIntOrNull() ?: 0
        val priceMax = input2?.toIntOrNull() ?: 0

        println("你输入的整数是: $priceMin 和 $priceMax")
        val phoneModelMap = mapOf(
            "redMi" to 1999, "honor" to 2599, "iphone14Pro" to 5999,
            "xiaomi14" to 4599, "huaweiMate60" to 6999, "iqoo" to 2499, "oppo" to 3999, "vivo" to 3499
        )

        for ((model, price) in phoneModelMap) {
            if (price in priceMin..priceMax) {
                println("model -> $model")
            }
        }
    } catch (e: NumberFormatException) {
        println("输入的值不是有效的整数: ${e.message}")
    }


}

fun testPersonArray() {
    val personArray = arrayOf(Person("tom", 19), Person("jack", 16), Person("amy", 21))

    val personList = personArray.toMutableList()
    personList.add(Person("peter", 23))
    personList.removeIf { person -> person.name == "tom" }

    for (p in personList)
        println("person: name-> ${p.name}, age->${p.age}")

}

fun testPersonMap() {
    val personMap = mutableMapOf<Int,Person>(1 to Person("tom", 19), 2 to  Person("jack", 16), 3 to Person("amy", 21))

    personMap[4] = Person("peter", 23)

    val iterator = personMap.iterator();

    while (iterator.hasNext()) {
        val entry = iterator.next()
        println("person: id-> ${entry.key}, person->${entry.value}")
    }

}

data class Person(val name: String, val age: Int)

