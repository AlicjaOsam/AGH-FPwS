object SumFractions {
  def sumfrac(p: Double): Double = {
    @scala.annotation.tailrec def inner(x: Double, s: Double): Double = {
      if (x > p) {
        inner(x / 2.0, s + x / 2.0)
      }else s
    }
    inner(1.0, 1.0)

  }

  def main(args: Array[String]):Unit={
    val sum1 = sumfrac(1e-3)
    val sum2 = sumfrac(1e-9)
    println(sum1)
    println(sum2)
  }
}

