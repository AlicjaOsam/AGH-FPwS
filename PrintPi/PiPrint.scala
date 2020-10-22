object PiPrint {
  @scala.annotation.tailrec
  def repN(n: Int, f: (Int)=> Int, x: Int):Int= {
    if(n == 0) x
    else repN(n-1, f, f(x))
  }
  def pi = 3.1415
  def pi(pi : Double) = pi*3.1415

  def main(args:Array[String]): Unit ={
    println(pi)
    println(pi(pi))
    println(pi(pi(pi)))
    println(repN(5, (x: Int) => 2*x , 1 ))
  }
}
