object Question5 extends App{
  def conditional[A]( x: A, p : A => Boolean , f: A => A ): A = {
    if (p(x))f(x)
    else x
  }
  val a = conditional[String]( "Hello World", _.size>10,_.reverse)
  val b = conditional[String]("Hello Scala", _.size<10,_.reverse)
  println(a)
  println(b)

}
