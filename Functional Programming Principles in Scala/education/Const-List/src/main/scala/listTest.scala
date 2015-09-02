import listcons._
object nth  extends App{
  def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  }

  val test = new Cons(1, new Cons(3, new Cons(5, new Nil)))

  println(nth(2, test))
}