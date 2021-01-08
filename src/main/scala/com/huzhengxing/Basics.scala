package com.huzhengxing

/**
 * @author 2021/1/7 14:39  zhengxing.hu
 * @version 1.0.0
 * @file Basics
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
object Basics {

  def main(args: Array[String]): Unit = {
    // 值
    val x = 1 + 1;
    // 不能定义值，类似java的final修饰
    //  x = 1
    // 变量
    var y = 1 + 1;
    y = 3;
    // 定义类型
    var v1: Int = 1;


    //**********代码块****************

    println({
      val x = 1 + 1
      x + 1
    })

    //************函数***************
    //匿名函数
    //    (v2: Int) =>
    //      v2 + 1


    //名称函数
    val addOne = (x: Int) => x + 1

    println(addOne(1))

    //多个参数函数
    val add = (x: Int, y: Int) => x + y
    println(add(1, 2))

    //无参函数
    val getTheAnswer = () => 43;




    //***********方法***********

    def addMethod(x: Int, y: Int): Int = x + y

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

    println(addThenMultiply(1, 2)(3))

    def addThenMultiply1(x: Int, y: Int, multiplier: Int): Int = (x + y) * multiplier

    println(addThenMultiply1(1, 2, 3))

    def name: String = System.getProperty("user.name")

    println("Hello," + name + "!")

    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }

    println("*********类*****************")
    class Greeter(prefix: String, suffix: String) {
      def greet(name: String): Unit = {
        println(prefix + name + suffix)
      }
    }
    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Albert")


    println("************ case class ***********")
    case class Point(x: Int, y: Int)

    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    if (point == anotherPoint) {
      println(point + " and " + anotherPoint + " are the same.")
    } else {
      println(point + " and " + anotherPoint + " are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (point == yetAnotherPoint) {
      println(point + " and " + yetAnotherPoint + " are the same.")
    } else {
      println(point + " and " + yetAnotherPoint + " are different.")
    } // Point(1,2) and Point(2,2) are different.

    println("********** 对象 **********")
    object IdFactory {
      private var counter = 0;

      def create(): Int = {
        counter += 1
        counter
      }
    }

    val newId = IdFactory.create()
    println(newId) // 1
    val newerId = IdFactory.create();
    println(newerId) //2


    println("********** Traits ***********")

//    trait Greeter1 {
//      def greet(name: String): Unit
//
//      //      def greet1 (name: String) : Unit = {
//      //        println("Hello, " + name + "!")
//      //      }
//    }

    trait Greeter1 {
      //      def greet(name: String): Unit

      def greet1(name: String): Unit = {
        println("Hello, " + name + "!")
      }
    }

    class DefaultGreeter extends Greeter1 {

    }

    class CustomizableGreeter(prefix: String, postfix: String) extends Greeter1 {
      override def greet1(name: String): Unit = {
        println(prefix + name + postfix)
      }
    }

    val greeter1 = new DefaultGreeter()
    greeter1.greet1("Albert")// Hello, Albert!

    val customizableGreeter = new CustomizableGreeter("How are you, ", "?")
    customizableGreeter.greet1("Albert") // How are you, Albert?




  }
}


