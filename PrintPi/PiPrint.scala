object PiPrint {
  def pi = 3.1415
  def pi(pi : Double) = pi*3.1415
  def repN(y: Int, x:Int=>Int, z:Int): Int ={
    if (y != z) x(repN(y - 1, x, z))
    else x(z)
  }

  def main(args:Array[String]): Unit ={
    println(pi)
    println(pi(pi))
    println(pi(pi(pi)))
    println(repN(5, (x: Int) => 2*x , 1 ))
  }
}
