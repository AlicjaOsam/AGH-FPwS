object filterList extends App{
  @scala.annotation.tailrec
  def filterList(list: List[String], predicate: String => Boolean, filteredList: List[String] = List()): List[String] = {
    if(list.isEmpty) return filteredList
    val l = if(predicate(list.head) )  list.head :: filteredList  else filteredList
    filterList(list.tail, predicate, l)
  }

  @scala.annotation.tailrec
  def reverseList(list: List[String], reversedList: List[String] = List()): List[String] = {
    if(list.isEmpty) return reversedList
    val l = list.head :: reversedList
    reverseList(list.tail, l)
  }
  
  val p = (x: String) => x.contains('p')
  println(filterList(List("Hello", "three", "people"), p))
  println(reverseList(list = List("Hello", "three", "people")))
}
