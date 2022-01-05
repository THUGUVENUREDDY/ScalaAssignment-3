object Question3 extends App{

  def product ( x: Int ): Int = {x*3}

  def f( x:Int , f : (Int => Int )): Int  = {f(x)}

  println(f(26, product))

}
