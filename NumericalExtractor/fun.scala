object fun{
  def evalEx(s: String): Double={
    val Operation(a, b) = s
    s match{
      case x: String if x.contains("+") => a + b
      case x: String if x.contains("-") => a - b
      case x: String if x.contains("*") => a * b
      case x: String if x.contains("/") => a / b
    }
  }
}
