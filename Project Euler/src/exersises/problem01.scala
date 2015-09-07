package exersises

object problem01 extends App {

  def isMultiples3or5(value: Int): Boolean = {
    if (value % 3 == 0 || value % 5 == 0)
      return true
    else
      return false
  }

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
