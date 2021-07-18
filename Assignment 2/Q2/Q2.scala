// 19001428

object Q2 {
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

  def primeSeq(num: Int): Unit = {
    if (num > 2) {
      primeSeq(num - 1)
    }

    if (prime(num)) {
      println(num)
    }
  }

  def prime(num: Int, i: Int = 2): Boolean = i match {
    case x if x == num        => true
    case x if GCD(num, x) > 1 => false
    case _                    => prime(num, i + 1)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0          => a
    case x if x > a => GCD(x, a)
    case _          => GCD(b, a % b)
  }
}
