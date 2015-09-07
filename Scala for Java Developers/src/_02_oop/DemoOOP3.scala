package _02_oop

class DemoOOP3 {
  val x:Int = I(1).k

  val y:Int =  +I(2)
  val y2:Int = I(3).unary_+()
}

case class I(var k:Int){
  def unary_+():Int = k + 1
}
