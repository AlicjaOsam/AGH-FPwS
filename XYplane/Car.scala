import scala.math.{cos, sin}

class Car(var xpos: Double, var ypos: Double, var direction: Double) {
  override def toString: String = "Car x: " + xpos.toString + " y:" + ypos.toString + " dir:" + direction.toString

  def turnLeft(): Unit = {
    direction = direction - 90
  }

  def turnRight(): Unit = {
    direction = direction + 90
  }

  def turnBack(): Unit = {
    direction = -direction
  }

  def forward(p: Double): Unit = {
    xpos = xpos + p * cos(direction)
    ypos = ypos + p * sin(direction)
  }
}
