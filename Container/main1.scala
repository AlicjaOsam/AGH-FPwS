object main1 {
  def main(args: Array[String]): Unit ={
    val a: TwistedMonoPair[A] = TwistedMonoPair[A](new B(7), new A)
    println(a(0))
    println(a(1))
    println(a)
    val b: TwistedMonoPair[A] = TwistedMonoPair[B](new B(9), new C(77))
    println(b)
    //val c: TwistedMonoPair[A] = new TwistedMonoTuple[B](new B(9), new A)

    val d1 = b.replace(0)(new A)
    println(d1)
    val tA: TwistedMonoPair[A] = d1
    //val tB: TwistedMonoPair[B] = d1
    val d2 = b.replace(1)(new A)
    println(d2)
  }
}
