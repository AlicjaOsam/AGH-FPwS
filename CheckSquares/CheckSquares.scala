import scala.math.sqrt

object CheckSquares {
  def noSquares(N: Int = 50){
    val list = for{x <-1 to N if (sqrt(x) %1 != 0 || x == 1)} yield x
      list.foreach(n => print(s"$n "))
    }

  def main(args: Array[String]): Unit ={
    noSquares(args(0).toInt)
  }
}
