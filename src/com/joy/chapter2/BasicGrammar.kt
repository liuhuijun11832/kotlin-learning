package com.joy.chapter2

//方法定义：参数Int，返回值Int
fun sum(a:Int,b:Int):Int{
    return a + b
}

//方法定义：返回类型自动推断
fun sum1(a: Int,b:Int) = a + b

//方法定义：public修饰的方法
public fun sum2(a:Int,b:Int): Int = a + b

//方法定义：无返回值函数
fun printSum(a:Int,b:Int):Unit{
    print(a+b)
}
//public的返回为Unit类型的，可以省略Unit
fun printSum1(a:Int,b: Int){
    print(a+b)
}

//变长参数使用vararg
fun vars(vararg v:Int){
    for (i in v) {
        println(i)
    }
}

fun main() {
    vars(1,2,3,4,5)
    //lambda表达式
    val sumLambda: (Int,Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))
    //变量 var <标识符>:<类型>=<初始值>
    var a:Int = 1

    //类型自动推断
    var b = 2

    //先声明，再赋值
    var c:Int
    c = 3;

    //常量 val <标识符>:<类型>=<初始值>
    val d:String="Hello World"

    /**
     * $表示一个变量名或者变量值
     * $varName 表示变量值
     * ${varName.fun()} 表示变量的方法返回值
     */
    val e = "$d ,Joy"
    val f = "new str:${e.replace("o","a")},old str:$e"
    print(f)

    //NULL检查机制
    //可为空
    var age: String? = "23"
    //抛出NPE
    var age1: Int = age!!.toInt()
    //不做处理
    var age2: Int = age?.toInt()
    //age为空则返回-1
    var age3: Int = age?.toInt() ?:-1

    //可以正常输出
    for (i in 1..4)
        println(i)
    //不能正常输出
    for (i in 4..1)
        println(i)
    println("输出+步长")
    //可以正常输出+步长
    for (i in 1..4 step 2)
        println(i)
    //正常输出-步长
    println("输出减步长")
    for (i in 4 downTo 1 step 2)
        println(i)
    //1到10 排除10
    println("直到10但是排除10")
    for (i in 1 until 10)
        println(i)
}
//自动类型转换
fun getStringLength(obj: Any): Int?{
    if (obj is String) {
        return obj.length
    }
    return null
}



