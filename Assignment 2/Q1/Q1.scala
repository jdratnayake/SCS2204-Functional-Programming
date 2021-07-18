// 19001428

object Q1 {
  def main(args: Array[String]): Unit = {
    println(prime(5))
    println(prime(8))
  }

  def prime(num: Int, i: Int = 2): Boolean = i match {
    case x if x == num        => true
    case x if GCD(num, x) > 1 => false
    case _                    => prime(num, i + 1)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case x if x == 0 => a
    case x if x > a  => GCD(x, a)
    case _           => GCD(b, a % b)
  }
}
