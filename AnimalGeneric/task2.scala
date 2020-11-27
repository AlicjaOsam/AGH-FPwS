object task2{
  def main(args: Array[String]): Unit = {
    val c: Plants = new Carrot
    val r = new Rabbit
    val w = new Wolf

    r.eat(c)
    w.eat(r)
  }
}
