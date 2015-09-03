package _01_intro


object Demo1 extends App {
  println("Hello")

  val point = new Point(3, 5)
  point.move(6, 6)
  point.dest = 5
  println(point.dest)

  println(point.x, point.y)
}

class Point(var x: Int, var y: Int) extends AnyRef{
  var dest: Int = _

  def move(x: Int, y: Int): Unit = {
    this.x += x
    this.y += y
  }
}
