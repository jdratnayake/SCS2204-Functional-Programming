// 19001428

object Q6 {
  def main(args: Array[String]): Unit = {
    fibonacciSeq(10)
  }

  def fibonacciSeq(num: Int): Unit = {
    if (num >= 0) {
      fibonacciSeq(num - 1)
      println(fibonacci(num))
    }
  }

  def fibonacci(num: Int): Int = num match {
    case x if x < 2 => x
    case x          => fibonacci(x - 1) + fibonacci(x - 2)
  }
}
