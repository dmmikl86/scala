package _01_intro

object Demo0 {
  def main(args: Array[String]) {
    println("Hello World!")

    val arr = Array(0, 1, 2)
    arr(1) = 0
    val t = new T(2)
    t.pr
    val k:Int => Int = 1 + ;
    println(k(5))

    if (k(7) > 0){
      print(3)
    }
  }
}

class T (val vale: Int)extends AnyVal{
  def pr = println(vale)
}
