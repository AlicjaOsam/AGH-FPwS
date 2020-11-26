object task2 {
  def checkType(x: Any): String = x match {
    case s: String => "String(" + s + ")"
    case i: Int => "Int(" + i + ")"
    case d: Double => "Double(" + d + ")"
  }

  def stream(l: List[Any]): String = {
    @scala.annotation.tailrec
    def dostream(l: List[Any], rest: String = ""): String = l match {
      case Nil => rest
      case el :: listBuffer => dostream(listBuffer, rest + checkType(el) + " ")
    }
    dostream(l)
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, "hello", 2.56, 0x45, "key")
    val streamed = stream(l)
    println(streamed)
  }
}
