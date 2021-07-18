// 19001428

object Q6 {
  def main(args: Array[String]): Unit = {
    println(fibonacciSeq(10))
  }

  def fibonacciSeq(num: Int): Int = {
    if (num > 0) {
      fibonacci(num) + fibonacciSeq(num - 1)
    } else {
      0
    }
  }

  def fibonacci(num: Int): Int = num match {
    case x if x < 2 => x
    case x          => fibonacci(x - 1) + fibonacci(x - 2)
  }
}
