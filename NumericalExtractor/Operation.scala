object Operation {
  def unapply(s: String): Some[(Double, Double)] ={
    val a = s.apply(0).toString.toInt
    val b = s.apply(2).toString.toInt
    val x = s.apply(1).toString
    if(x != "+" || x != "-" || x != "*" || x != "/") None
    Some(a,b)
  }
}
