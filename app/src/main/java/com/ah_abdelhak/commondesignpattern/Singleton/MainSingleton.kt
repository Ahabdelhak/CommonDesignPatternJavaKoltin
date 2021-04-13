package com.ah_abdelhak.commondesignpattern.Singleton

import com.ah_abdelhak.commondesignpattern.Singleton.Java.JavaSingleton
import com.ah_abdelhak.commondesignpattern.Singleton.Kotlin.KotlinSingleton


/*
* Class Show Implementation Of Kotlin and Java Singleton Design Pattern
* */
class MainSingleton {
    val mSingleton: KotlinSingleton.Companion?=null

    /*-------------------Kotlin Instance Implementaion--------------------*/
    fun getSingletonInstance(): String {
        if(mSingleton?.language == null){
            mSingleton!!.language = "ar"
        }
        return "ar"
    }

    /*-------------------Java Instance Implementaion--------------------*/
    fun JavaInstanceImpl() {
        // Create instance from Singleton class and set its data
        val singleton1: JavaSingleton = JavaSingleton.getInstance()
        /*singleton1.setId(1)
        singleton1.setText("Singleton 1")*/

        // When trying to create another instance it will return the same instance created above
        val singleton2: JavaSingleton = JavaSingleton.getInstance()
        //println(singleton2.getId().toString() + ", " + singleton2.getText())
    }

}