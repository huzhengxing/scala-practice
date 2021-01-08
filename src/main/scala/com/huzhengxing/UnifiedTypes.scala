package com.huzhengxing

/**
 * @author 2021/1/7 16:34  zhengxing.hu
 * @version 1.0.0
 * @file UnitfiedTypes
 * @brief
 * @par
 * @warning
 * @par 杭州锘崴信息科技有限公司版权所有©2020版权所有
 */
object UnifiedTypes {

  def main(args: Array[String]): Unit = {
    println("************类型结构****************")
    var any: Any = 1;
    var anyVal: AnyVal = 2
    var double: Double = 2

    val list: List[Any] = List(
      "a string",
      1, // an integer
      'c', //a character
      true // a boolean value
    )
    list.foreach(e=> println(e))


    println("*************类型转换***************")

    val x : Long = 123153125;
    println("x:"+ x)
    val y : Float = x
    println("y:" + y)
    val char : Char = 'a'
    println("char:" + char)
    val number : Int = char
    println("number:" + number)

    println()










  }
}
