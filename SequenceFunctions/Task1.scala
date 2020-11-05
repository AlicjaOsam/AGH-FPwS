import scala.annotation.tailrec
import scala.math.pow

object Task1{
  def main(args: Array[String]):Unit={
    sequence()
  }
  def sequence(): Unit ={
    val sub_one = (x: Double) => x - 1
    val add_one = (x: Double) => x + 1
    val square = (x: Double) => x * x
    def sub(x: Double): Double => Double={
      (y: Double) => x - y
    }
    def pn(n: Double): Double => Double ={
      (x: Double) => pow(x, n)
    }
    @tailrec
    def eval(l: List[Double => Double], x: Double): Double = {
      if(l.length == 1)
        l.head(x)
      else{
        val l2 = l.tail
        val y = l.head(x)
        eval(l2, y)
      }
    }
    val l1 = List(pn(2), sub_one, add_one)
    val l2 = List(square, sub(2), pn(5))
    println(eval(l2, 2))
    println(eval(l1, 4))
    println (pn(5)(sub_one(add_one(2))))
  }
}
