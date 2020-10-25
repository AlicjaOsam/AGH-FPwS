import scala.math.{pow, sqrt}

object Pythagorean {
  def triangle(x: Int, m: String, y: Int, n: String):Double = {
    if(m == "c"){
      sqrt(pow(x, 2) - pow(y, 2))
    }else if(n == "c"){
      sqrt(pow(y, 2) - pow(x, 2))
    }else sqrt(pow(x, 2) + pow(y, 2))
  }
  def main(args: Array[String]): Unit ={
    val third = triangle(args(0).toInt, args(1), args(2).toInt, args(3))
    println(third)
  }
}
