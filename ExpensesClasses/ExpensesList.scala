  def printList(): Unit = {
    println(list.mkString("\n"))
  }

  def sum: Double = {
    var s = 0.0
    for(i <- list){
      s += i.amount
    }
    s
  }

  def max(): Expense = {
    val m: Expense => Double = element => element.amount
    list.maxBy(m)
  }
}

object ExpensesList{
  def apply() = new ExpensesList
}
