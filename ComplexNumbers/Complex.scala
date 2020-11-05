import scala.math.{asin, cos, pow, sin, sqrt}

object Complex {
  class Complex(val Re: Double, val Im: Double){
    def +(other: Complex): Complex = {
      new Complex(other.Re + Re, other.Im + Im)
    }
    def -(other: Complex): Complex = {
      new Complex(other.Re - Re, other.Im - Im)
    }
    override def toString: String ={
      "Re:{" + Re + "} Im:{" + Im + "}"
    }
    def r(): Double ={
      sqrt(pow(Re, 2) + pow(Im, 2))
    }
    def angle(): Double ={
      asin(Im/sqrt(pow(Re, 2) + pow(Im, 2)))
    }
  }

  object Complex{
    def apply(Re: Double, Im: Double) = new Complex(Re, Im)
    def polar(r: Double, angle: Double): Complex ={
      new Complex(r*sin(angle), r*cos(angle))
    }
  }

  def main(args: Array[String]): Unit ={
    val x = Complex(1,2)
    val y = Complex(3,2)
    println("x " + x + " y " + y + " x+y " + (x+y) + " x-y " + (x-y))
    val f = Complex.polar(r=3, angle=math.Pi)
    println(f)
    println("|x| "+ x.r + " angle " + x.angle)
  }
}
