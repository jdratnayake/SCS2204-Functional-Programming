// 19001428

object Q4 {
  def main(args: Array[String]): Unit = {
    println(odd(11))
    println(odd(12))

  }

  def even(num: Int): Boolean = num match {
    case 0 => true
    case _ => odd(num - 1)
  }

  def odd(num: Int): Boolean = !even(num)
}
