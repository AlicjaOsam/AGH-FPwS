trait IntRichMoves {
  def setX(x: Int)
  def setY(y: Int)
  def getX(): Int
  def getY(): Int
  def up(y: Int=1){
    setY(getY()+y)
  }
  def down(y: Int=1){
    setY(getY()-y)
  }
  def left(x: Int=1){
    setX(getX()-x)
  }
  def right(x: Int=1){
    setX(getX()+x)
  }
  def here(a: IntRichMoves){
    setX(a.getX())
    setY(a.getY())
  }
  def zero() {
    setX(0)
    setY(0)
  }
}
