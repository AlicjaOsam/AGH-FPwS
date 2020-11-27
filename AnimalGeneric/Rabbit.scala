class Rabbit extends Animal{
  type T = Plants
  override def eat(p: Plants): Unit ={
    println("Rabbit crunches the " + p.getClass.getSimpleName)
  }
}