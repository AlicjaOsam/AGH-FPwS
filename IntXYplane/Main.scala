object Main {
  def main(args: Array[String]): Unit = {
    val car1 = new Car(0, 0)
    println(car1)
    val car2 = new Car(1, 0)
    println(car2)

    val betterCar = new Car(0, 0) with IntRichMoves
    println(betterCar)
    betterCar.up()
    println(betterCar)
    betterCar.right(3)
    println(betterCar)
    betterCar.down(5)
    println(betterCar)
    betterCar.left(5)
    println(betterCar)

    val runner = new Horse((1, 1)) with IntRichMoves
    println(runner)
    runner.here(betterCar)
    println(runner)
    runner.zero()
    println(runner)
  }
}
