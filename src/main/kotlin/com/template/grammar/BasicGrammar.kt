package com.template.grammar

/**
 * author: jack hu
 * @Create: 2023-11-25 22:22
 * @Description:
 **/
fun main() {
//    sumTest()

//    nullCheck()

//    nullCheckAs()

//    nullCheckLet()

    getStringLength("obj")

    loopPrint()
}

/**
 * 无返回值的函数(关键字：Unit 类似Java中的void)
 * 在 Kotlin 中，; 符号并不是必需的用于标记语句结束的字符。Kotlin 允许你在大多数情况下省略分号
 * $ 字符串模板
 */
fun sumTest(): Unit {
    println("sum result: 1+2: " + sum(1, 2));
    println("sumAuto result: 2+2: " + sumAuto(2, 2));
    println("sumLambda result: 3+4: ${sumLambda(3, 4)}")
}

/***
 * 函数定义，关键字fun 带返回值
 */
fun sum(a: Int, b: Int): Int {
    return a + b;
}

/***
 * 函数定义 表达式作为载体，自动推断类型
 */
fun sumAuto(a: Int, b: Int) = a + b

/**
 * vararg 关键字用于定义可变数量的参数（变长参数）。使用 vararg 关键字可以让函数接受不定数量的参数，这些参数会被作为数组传递给函数。
 */
fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

/**
 * Lambda 表达式是一种简洁的方式来表示函数，它可以被传递作为参数，或者赋值给变量。Lambda 表达式的基本语法是使用花括号 {} 定义函数体，有时候会伴随着参数列表和箭头 ->。
 */
val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

/**
 * 可变变量定义：var 关键字
 *   var <标识符> : <类型> = <初始化值>
 * 不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
 *   val <标识符> : <类型> = <初始化值>
 */
fun defineVariable(): Unit {
    val a: Int = 1
    val b = 1       // 系统自动推断变量类型为Int
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值


    var x = 5        // 系统自动推断变量类型为Int
    x += 1           // 变量可修改

}

/**
 * 在类型后面加上 ? 表示该类型可以为 null。
 *  ?. 是一个在调用可能为空的对象的方法时非常有用的操作符。它允许你调用对象的方法或访问属性，如果对象不为空则执行操作，如果为空则返回 null。
 *  ?: 或称为 Elvis 操作符，可以用来在对象为 null 时提供一个默认值。
 *  !! 可以将一个可空类型强制转换为非空类型。但要小心使用，因为如果对象为空，会触发空指针异常。
 */
fun nullCheck(): Unit {
    //类型后面加?表示可为空
    var age: String? = null
    //不做处理返回 null
    val ages1 = age?.toInt()
    println("ages1 is $ages1")
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println("ages2 is $ages2")
    //抛出空指针异常
    val ages = age!!.toInt()

}

/**
 * Kotlin 中的 as? 运算符用于进行安全的类型转换,它相当于类型转换运算符 as 与安全调用运算符 ? 的结合。
 * as? 运算符进行类型转换时,如果转换失败会返回 null,而不是抛出异常。这可以避免使用 as 运算符进行类型转换时,由于转换不成功而使程序崩溃的风险。
 */
fun nullCheckAs(): Unit {
    val str = "123"
    val num = str as? Int

    println("null check as: num is $num")
}

/**
 * ?.let 是 Kotlin 中常用的安全调用操作符,用于对象为空时避免异常的场景。
 * 其基本语法是:
 * obj?.let {
 * 对非空 obj 执行操作
 * }
 * 这个表达式的意思是:
 * 如果 obj 非空,则执行 let 中的代码块
 * 如果 obj 为空,则不做任何操作直接返回
 * let 函数接收一个 lambda 表达式作为参数。这个 lambda 中可以安全地使用 obj,因为我们已经判断过其非空。
 *
 *
 *
 * 在 ?.let 中的 lambda 表达式里,it 是 Kotlin 提供的一个隐式名称,代表了 ?.let 前面的对象,在这个例子中就是 name。
 * name?.let {...} 等价于:
 * name?.let { name ->
 * println("Name Length is ${name.length}")
 * }
 */
fun nullCheckLet() {
    val name: String? = "Kotlin"

    name?.let {
        println("Name Length is ${it.length}")
    }
}

/**
 * 使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)
 *
 * Any 在Kotlin中是一个基本的标记接口,代表了所有Kotlin类的超类
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        println("obj str length: ${obj.length}")
        return obj.length
    }
    return null
}

fun loopPrint() {
    print("循环输出：")
    for (i in 1..4) print(i) // 输出“1234”
    println("\n----------------")
    print("设置步长：")
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("\n----------------")
    print("使用 until：")
    // 使用 until 函数排除结束元素
    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")

}

