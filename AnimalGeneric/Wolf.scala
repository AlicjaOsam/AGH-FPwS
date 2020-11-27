class Wolf extends Animal{
  type T = Animal
  override def eat(a: Animal): Unit ={
    println("Wolf tears apart the " + a.getClass.getSimpleName)
  }
}
