class Car ( var xpos: Int , var ypos: Int ) {
  override def toString = "Car x: "+xpos.toString + " y:"+ypos.toString
  def setX(x: Int){
    xpos = x
  }
  def setY(y: Int){
    ypos = y
  }
  def getX(): Int = xpos
  def getY(): Int = ypos
}
