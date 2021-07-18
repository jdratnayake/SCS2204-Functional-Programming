object Q5 {
  def main(args: Array[String]): Unit = {
    println(addEven(10))
  }

  def addEven(num: Int): Int = {
    if (num < 2) {
      0
    } else {
      if (!odd(num)) {
        num + addEven(num - 1)
      } else {
        addEven(num - 1)
      }
    }
  }

  def even(num: Int): Boolean = num match {
    case 0 => true
    case _ => odd(num - 1)
  }

  def odd(num: Int): Boolean = !even(num)
}
