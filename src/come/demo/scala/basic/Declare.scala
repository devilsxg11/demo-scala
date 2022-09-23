package come.demo.scala.basic

/**
 * Copyright：dp.com
 * Author: SongXiaoGuang
 * Date: 2022/9/23.
 * Description:
 */
object Declare {

  def main(args: Array[String]): Unit = {
    val name = "tom"   // immutable 不可变
    var age = 18        // mutable 可变

    // Scala 编译器自动推断出变量的数据类型
    val city: String = "tom"
    var sex: Int = 1

    age = 22;
    //name = "jerry";
  }
}
