import Expense._
import scala.annotation.tailrec


class ExpensesList {
  var list: List[Expense] = Nil

  def +=(other: Expense): Unit = list = list :+ other

  def printList(): Unit = {
    pri(list)
    @tailrec def pri(l: List[Expense]) {
      if (l.isEmpty) { }
      else {
        println(l.head.amount, l.head.item_name, l.head.category)
        pri(l.tail)
      }
    }
  }

  def sum(): Double = {
    @tailrec def summar(l: List[Expense], s: Double) : Double={
      if (l.isEmpty) { s }
      else {
        summar(l.tail, s + l.head.amount)
      }
    }
    summar(list, 0)
  }

  def max(): String = {
    @tailrec def maxim(l: List[Expense], lm: Expense): String={
      if (l.isEmpty) { lm.item_name }
      else if (l.head.amount > lm.amount) {
        maxim(l.tail, l.head)
      }
      else {
        maxim(l.tail, lm)
      }
    }
    maxim(list, list.head)
  }
}

  object ExpensesList{
    def apply() = new ExpensesList
  }


