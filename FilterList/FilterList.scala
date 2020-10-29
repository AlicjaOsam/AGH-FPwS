import scala.annotation.tailrec

object FilterList {
  var filtered: List[String] = Nil
  def filterList(list: List[String], predict: String => Boolean): List[String] ={
    var filtered: List[String] = Nil
    @tailrec def check(l: List[String]): Any = {
      if(l.isEmpty) { return }
      if(predict(l.head)){
        filtered = filtered :+ l.head
      }
      check(l.tail)
    }
    check(list)
    filtered
  }

  def reverseList(list: List[String]): List[String] ={
    var reversed: List[String] = Nil
    @tailrec def reverse(l: List[String]): Any = {
      if(l.isEmpty) { return }
      reversed = l.head :: reversed
      reverse(l.tail)
    }
    reverse(list)
    reversed
  }

  def main(args: Array[String]): Unit ={
    val p = (x: String) => x.contains('p')
    println(filterList(List("Hello", "three", "people"), p))
    println(reverseList(list = List("Hello", "three", "people")))
  }
}
