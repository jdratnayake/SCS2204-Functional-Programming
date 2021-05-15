// 19001428

object Q3 extends App{
  def bookCal(num: Int): Double = {
    var total: Double = 24.95 * .6 * num + 3;

    if(num > 50){
      total += (num - 50) * .75;
    }

    total -= total % .01;

    return total;
  }

  println("Total cost is Rs. " + bookCal(60));
}
