package _02_oop

object DemoOOP2  extends App{
  val sin: Double => Double = Math.sin
  val cos: Double => Double = Math.cos

  val f: Double => Double = x => cos(sin(x))

  val g: Double => Double = cos compose sin

  var l = 5 :: 4 :: 8 :: 2 :: 1 :: Nil

  println(l.sorted)
}