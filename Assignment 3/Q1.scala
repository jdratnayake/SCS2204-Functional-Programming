// 19001428

object Q1{
  def main(args:Array[String]):Unit = {
    val st = "JanithaDevinRatnayake"

    val ct = cipher(E, st, 5, alphabet)
    println("Cipher Text = " + ct);

    val pt = cipher(D, ct, 5, alphabet)
    println("Plain Text = " + pt);

    if(st.toUpperCase == pt){
      println()
      println("Plain Text is Equal to Original Text");
    }
    else{
      println()
      println("Plain Text is Not Equal to Original Text");
    }
  }

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.size)

  val abs = (num:Int, a:String) => if(num >= 0) num else a.size + num

  val D = (c:Char, key:Int, a:String) => a(abs(((a.indexOf(c.toUpper) - key) % a.size), a))

  val cipher = (algo:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algo(_, key, a))
}
