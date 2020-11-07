package StringDecorators{
  trait htmlH2 {
    override def toString: String ={
      "<H2>" + super.toString + "</H2>"
    }
  }
  trait htmlI{
    override def toString: String ={
      "<I>" + super.toString + "</I>"
    }
  }
  trait Capitalisation{
    override def toString: String={
      super.toString.capitalize
    }
  }
  trait PageStretch{
    val llen = 33
    val l = llen/7
    override def toString: String={
      super.toString.replace(" ", " "*l)
    }
  }
}

