object Arrays {
  def niceRowPrint(a: Array[Int]): Unit ={
    val g = for{ i <- 0 to a.length-1 } yield a(i)
    print("| ")
    g.foreach(n => print(s"$n "))
    println("|")
  }

  def nicePrint(arr: Array[Array[Int]]): Unit ={
    for ( row <- arr ) niceRowPrint((row))
  }

  def SumofRow(arr:Array[Array[Int]]): Array[Int] ={
    val r = new Array[Int](4)
    for (i <- 0 to 3; j <- 0 to 4)
      r.update(i,r(i)+arr(i)(j))
    r
  }

  def SumofColumn(arr:Array[Array[Int]]): Array[Int] ={
    val c = new Array[Int](5)
    for ( i <- 0 to 3; j <- 0 to 4)
      c.update(j,c(j)+arr(i)(j))
    c
  }

  def Transpose(arr:Array[Array[Int]]): Array[Array[Int]] ={
    val T = Array.ofDim[Int](5,4)
    for ( i <- 0 until 4; j <- 0 until 5)
      T(j)(i)=arr(i)(j)
    T
  }

  def Merge(arr1:Array[Array[Int]], arr2:Array[Array[Int]]): Array[Array[Int]] ={
    for ( i <- 0 to 3; j <- 0 to 4){
      arr2(i)(j)= arr1(i)(j)+arr2(i)(j)
    }
    arr2
  }

  def main(args: Array[String]):Unit={
    val x = Array.ofDim[Int](4,5)
    for(i <- 0 until 4; j <- 0 until 5) x(i)(j) = i+j
    val y = Array.ofDim[Int](4,5)
    for(i <- 0 until 4; j <- 0 until 5) y(i)(j) = i+j
    nicePrint(x)
    val Array1 = SumofRow(x)
    val Array2 = SumofColumn(x)
    val Array3 = Transpose(x)
    println("Array 1")
    niceRowPrint(Array1)
    println("Array 2")
    niceRowPrint(Array2)
    println("Array 3")
    nicePrint(Array3)
    println("After merge")
    nicePrint(Merge(x, y))
  }
}
