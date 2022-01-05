object Question1 extends App{
  def max_num(a:Int, b: Int ): Int = {
    if(a > b) a
    else b
  }
  def max_sized_tuple(t : ( Int, Int, Int ), func: (Int, Int)=> Int) : Int  = {func(t._1, func(t._2, t._3))}
  println(max_sized_tuple((26,4,99), max_num))
}
