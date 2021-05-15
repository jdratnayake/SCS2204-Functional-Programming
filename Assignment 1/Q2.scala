// 19001428

object Q2 extends App{
  def vol(r: Double): Double = (4 / 3.0) * math.Pi * r * r * r;

  println("Volume of the sphere is " + (vol(5) - vol(5) % 0.01) + " Units");
}
