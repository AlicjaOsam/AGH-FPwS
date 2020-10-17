 import scala.math._

  object Task1{

    def check(x:Double, y:String): Double ={
      if(y == "rad"){
        x
      }else{
        (x*3.14)/180
      }
    }

    def main(args: Array[String]): Unit ={
      val a = check(args(0).toDouble, args(1))
      println("Sine = "+ sin(a) + " Cosine = "+ cos(a) + " Tangens = "+ tan(a))
      for( i<- -10 to 10){
        val d = i*3.14/180
        println("x + " + i + " deg " +  "Sine = "+ sin(a+i) + " Cosine = "+ cos(a+i) + " Tangens = "+ tan(a+i))
      }
    }
  }


