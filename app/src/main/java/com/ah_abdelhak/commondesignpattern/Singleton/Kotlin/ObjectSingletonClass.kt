package com.ah_abdelhak.commondesignpattern.Singleton.Kotlin

object ObjectSingletonClass
{
    init {
        println("Singleton class invoked.")
    }
    var name = "Kotlin Objects"
    fun printName()
    {
        println(name)
    }

}

class A {
    init {
        println("Class init method. Singleton name property : ${ObjectSingletonClass.name}")
        ObjectSingletonClass.printName()
    }
}

fun main(args: Array<String>) {
    ObjectSingletonClass.printName()
    ObjectSingletonClass.name = "KK"

    var a = A()
}


//Following is printed in the console.
//Singleton class invoked.
//Kotlin Objects
//Class init method. Singleton name property : KK
//KK