package exersises

import exersises.math.MathUtil._

object _001_Multiples_of__and_5 extends App {

  def sumOfMultiples(n: Int, result: Int = 0): Int = {
    if (n == 0)
      return result
    else
    if (isMultiples3or5(n))
      return sumOfMultiples(n - 1, result + n)
    else
      return sumOfMultiples(n - 1, result)
  }

  println(sumOfMultiples(999))
}
