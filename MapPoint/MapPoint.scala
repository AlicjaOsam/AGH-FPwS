import scala.math.pow

class MapPoint(val name: String, val latitude: Double, val longitude: Double) {
  def -(other: MapPoint): Double = {
     math.sqrt(pow(other.latitude - latitude, 2) + pow(other.longitude - longitude, 2))
  }
  def distanceTo(other: MapPoint): Any = this - other
  def move(x: Double, y: Double): MapPoint = new MapPoint("Nearby " + name, latitude + x, longitude + y)
  override def toString: String = {
    val latiStr = if (latitude >= 0) { latitude + "N" } else { -latitude + "S" }
    val longiStr = if (longitude >= 0) { longitude + "E" } else { -longitude + "W" }
    name + " " + latiStr + " " + longiStr
  }
}

object MapPoint{
  def apply(name: String, latitude: Double, longitude: Double) = new MapPoint(name, latitude, longitude)
  def inTheMiddle(p1: MapPoint, p2: MapPoint, n: String) : MapPoint = {
    val lati = (p1.latitude + p2.latitude) / 2.0
    val longi = (p1.longitude + p2.longitude) / 2.0
    new MapPoint(n, lati, longi)
  }
}