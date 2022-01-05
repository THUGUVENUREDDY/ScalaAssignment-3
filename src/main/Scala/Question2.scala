object Question2 extends App{
  val first_num = util.Random.nextInt
  val second_num = util.Random.nextInt
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  def min(x: Int, y: Int): Int = {
    if (x > y) y
    else x
  }
  def next_val(x: Int, y: Int)= y

     println(max(first_num, second_num))
     println(min(first_num, second_num))
     println(next_val(first_num, second_num))
}
