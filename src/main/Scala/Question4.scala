object Question4 extends App{

  def f( x: Int, f:Int=> Unit): Int = {f(x) ;x}

      f(10, x => println(x*10))
}
