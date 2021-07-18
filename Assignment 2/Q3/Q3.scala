object Q3 {
  def main(args: Array[String]): Unit = {
    println(sum(5))
  }
  def sum(num: Int): Int = {
    if (num == 1) {
      1
    } else {
      num + sum(num - 1)
    }
  }
}
