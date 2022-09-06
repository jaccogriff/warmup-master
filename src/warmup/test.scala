package warmup

import scala.collection.mutable.ArrayBuffer

object test {
  def main(args: Array[String]): Unit = {
    var a : String = "1"
    var b : String = "2"
    var c : Int = a.toInt + b.toInt

    var arr : ArrayBuffer[String] = ArrayBuffer("Hola", "Hola", "soy", "jacco")
    arr -= "Hola"
    println(arr)
  }
}
