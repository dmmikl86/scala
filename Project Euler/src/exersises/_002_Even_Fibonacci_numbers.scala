package exersises

import exersises.math.MathUtil

object _002_Even_Fibonacci_numbers extends App {

  def fibonacciList(limit: Int, list: List[Int] = Nil, n: Int = 1): List[Int] = {
    val fibo: Int = MathUtil.fibo(n)
    if (fibo >= limit) {
      list
    } else {
      fibonacciList(limit, list :+ fibo, n + 1)
    }
  }

  val evenFiboList: List[Int] = fibonacciList(4000000).filter(MathUtil.isEven)
  println(evenFiboList.sum)
}