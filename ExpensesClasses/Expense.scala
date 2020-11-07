class Expense(val amount: Double, val item_name: String, val category: String) {
  override def toString: String = {
    amount + " " + item_name + " " + category

  }
}

object Expense{
  def apply(amount: Double, item_name: String, category: String) = new Expense(amount, item_name, category)
}
