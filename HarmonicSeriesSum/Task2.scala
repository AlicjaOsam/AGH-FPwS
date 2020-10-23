object Task2 {
  def sumfrac(p: Double): Double = {
    @scala.annotation.tailrec def inner(s: Double, n: Int): Double = {
      if(1.0 / n < p){
        s
      } else inner(s + 1.0 / n, n + 1)
    }
    inner(0.0, 1)
  }

  def main(args: Array[String]):Unit={
    val sum1 = sumfrac( 1e-3 )
    val sum2 = sumfrac( 1e-9 )
    println(sum1)
    println(sum2)
  }
}


