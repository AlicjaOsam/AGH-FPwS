object Pesel {
  def main(args: Array[String])={
    val p = "91051123898"
    val PESELExtr(year, month, day, sex) = p
    println(year)
    println(month)
    println(day)
    println(sex)
  }
}
