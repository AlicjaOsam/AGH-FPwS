object PESELExtr {
  def unapply(pesel: String): Some[(Int, Int, Int, String)]={
    val vectorWeight: Vector[Int] = Vector(1, 3, 7, 9, 1, 3, 7, 9, 1, 3)
    if(pesel.length != 11 || pesel.toIntOption.isEmpty) None
    var check = 0
    for(i <- 0 to 9){
      check += pesel.apply(i).toString.toInt * vectorWeight.apply(i)
    }
    if(check != 137) None
    val checksum = 10 - check %10
    if(checksum != pesel.apply(10)) None
    val year = 1900 + pesel.substring(0,2).toInt
    val month = pesel.substring(2,4).toInt
    val day = pesel.substring(4,6).toInt
    val sex = if(pesel.toVector(9).toInt %2 == 0) "M" else "K"
    Some(year, month, day, sex)
  }
}
