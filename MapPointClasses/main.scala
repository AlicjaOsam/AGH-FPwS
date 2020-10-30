import MapPoint._

object main {
  def main(args: Array[String]): Unit ={
    val krk = MapPoint("Krakow", 50.061389, 19.938333)
    println(krk)
    val nyc = MapPoint("NYC", 40.7127, -74.0059)
    println(nyc)
    val porto = MapPoint("Porto", 41.162142, -8.621953)
    val irkutsk = MapPoint("Irkutsk", 52.283333, 104.283333)
    println(irkutsk)
    println(porto - irkutsk)
    println(krk - irkutsk)
    println(krk.distanceTo(porto))
    val mp = inTheMiddle(krk, irkutsk, "Somwhere in Russia")
    println(mp + " " + (mp - krk) + " " + (mp - irkutsk))
    val r = Route(krk, nyc, porto)
    println(r)
    r.addStop(porto.move(1, 1))
    r.addStop(irkutsk)
    println(r)
  }
}
