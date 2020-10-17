object Task2 {

  def niceRowPrint(a: Array[Int]): Unit ={
    val g = for{ i <- 0 to a.length-1 } yield a(i)
    print("| ")
    g.foreach(n => print(s"$n "))
    println("|")
  }

  def nicePrint(arr: Array[Array[Int]]): Unit ={
    for ( row <- arr ) niceRowPrint((row))
  }

  def main(args: Array[String]){
    val x: Array[Array[Int]] = Array.ofDim[Int](4,4);
    for ( i <- 0 until 4; j <- 0 until 4) x(i)(j) = i+j
    val y = Array.ofDim[Int](4,5);
    for ( i <- 0 until 4; j <- 0 until 5) y(i)(j) = i*j

    nicePrint(x)
    nicePrint(y)

  }
}
