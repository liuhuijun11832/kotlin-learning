package com.joy.chapter1

class HelloWorld(val name: String){
    fun greet(){
        println("Hello: $name")
    }
}
//包级可见的函数
fun main(){
    HelloWorld("Joy").greet()
}