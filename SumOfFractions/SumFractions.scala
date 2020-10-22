object SumFractions {
  def sumfrac(p: Double): Double = {
    var sum: Double = 0
    @scala.annotation.tailrec def inner(x: Double): Unit = {
      if (x > p) {
        sum += x
        inner(x / 2.0)
      }
    }
    inner(1.0)
    sum
  }

  def main(args: Array[String]):Unit={
    val sum1 = sumfrac(1e-3)
    val sum2 = sumfrac(1e-9)
    println(sum1)
    println(sum2)
  }
}

