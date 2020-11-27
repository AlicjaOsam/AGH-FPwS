import fun.evalEx

object task {
  def main(args: Array[String]): Unit ={
    val Operation(a, b) = "2+6"
    println(a)
    println(b)
    println(evalEx("2+5"))
    println(evalEx("2-5"))
    println(evalEx("2*5"))
    println(evalEx("2/5"))
  }
}
