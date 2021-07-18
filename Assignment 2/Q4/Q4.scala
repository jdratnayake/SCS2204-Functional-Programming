// 19001428

object Q4 {
  def main(args: Array[String]): Unit = {
    oddEven(11)
    oddEven(12)

  }

  def oddEven(num: Int): Unit = {
    if (odd(num)) {
      printf("%d is an Odd Number\n", num);
    } else {
      printf("%d is an Even Number\n", num);
    }
  }

  def even(num: Int): Boolean = num match {
    case 0 => true
    case _ => odd(num - 1)
  }

  def odd(num: Int): Boolean = !even(num)
}
