object StringConversions {

  implicit def toMultipleHelper(i: Int): MultipleHelper = new MultipleHelper(i)

  implicit def toSplitHelper(s: String): SplitHelper = new SplitHelper(s)

  class MultipleHelper(val i: Int){
    def *(string: String): String = string * i
  }

  class SplitHelper(val s: String){
    def /(c: Char): List[String] = s.split(c).toList
  }

  def |(s: String): String = s.trim

  def main(args: Array[String]): Unit ={
    val r = 4*"ala"
    println(r)
    println( "ala ma kota"/' '  )
    println( "+"+ |(" hello people  ") +"+" )
  }
}

