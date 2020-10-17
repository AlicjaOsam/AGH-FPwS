import scala.math.sqrt
import scala.util.Random

object MonteCarlo {

  def point_check(): Boolean={
    val (x, y) = (Random.nextDouble(), Random.nextDouble())
    sqrt(x*x + y*y) < 1
  }

  def generate(N: Int): IndexedSeq[Boolean]={
    val g = for{i <-1 to N} yield point_check()
    g
  }

  def count(p: IndexedSeq[Boolean]): Int ={
    val inside = p.count(_ == true)
    inside
  }

  def montecarlo(N: Int): Unit ={
    val counted = count(generate(N))
    val estimated = 4.0*counted/N
    println("Estimated pi = " + estimated)
  }

  def main(args: Array[String]): Unit ={
    montecarlo(10000)
  }
}
