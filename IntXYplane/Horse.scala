class Horse ( var mypos: (Int, Int)) {
  override def toString = "Horse x: " + mypos._1.toString + " y:" + mypos._2.toString
  def setX(x: Int){
    mypos = (x, mypos._2)
  }
  def setY(y:Int){
    mypos = (mypos._1,y)
  }
  def getX(): Int = mypos._1
  def getY(): Int = mypos._2
}