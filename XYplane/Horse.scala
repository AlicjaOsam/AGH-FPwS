import scala.math.{cos, sin}

class Horse(var mypos: (Double, Double), var whereHeading: Double)  {
  override def toString: String = "Car x: " + mypos._1.toString + " y:" + mypos._2.toString + " dir:" + whereHeading.toString

  def turnLeft(): Unit = {
    whereHeading = whereHeading - 90
  }

  def turnRight(): Unit = {
    whereHeading = whereHeading + 90
  }

  def turnBack(): Unit = {
    whereHeading = -whereHeading
  }

  def forward(p: Double): Unit = {
    mypos = (mypos._1 + p * sin(whereHeading), mypos._2 + p * cos(whereHeading))
  }
}
