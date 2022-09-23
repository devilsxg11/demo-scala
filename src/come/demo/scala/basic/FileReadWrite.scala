package come.demo.scala.basic

import java.io.PrintWriter
import scala.io.Source

/**
 * Copyright：dp.com
 * Author: SongXiaoGuang
 * Date: 2022/9/23.
 * Description:
 */
object FileReadWrite {

  def main(args: Array[String]): Unit = {

    // 1. 读取文件
    val file = Source.fromFile("D:\\warn.log")
    // 返回结果是一个迭代器
    val lines = file.getLines()
    for(line <- lines) println(line)

    // 2. 写入文件，这里可以看到直接引用了 JDK IO 下面的包
    val writer = new PrintWriter("D:\\output.log")
    // 输出文件
    for(i <- 1 to 5) writer.println(i)
    writer.close()
  }

}
