case class Route(points: MapPoint*) {
  var pts: Seq[MapPoint] = points

  def addStop(point: MapPoint): Unit = {
    pts = pts :+ point
  }

  override def toString: String = {
    val revp = pts.reverse
    var send: String = revp.head.toString
    for (i <- revp.tail) {
      send += " -> " + i.toString
    }
    send
  }
}
