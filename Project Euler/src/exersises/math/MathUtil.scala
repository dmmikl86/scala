package exersises.math

object MathUtil {
  def isMultiples3or5(value: Int): Boolean = {
    if (value % 3 == 0 || value % 5 == 0)
      return true
    else
      return false
  }

  def fibo(n: Int):Int = {
    if (n <= 1)
      return 1
    else
      return fibo(n - 1) + fibo(n - 2)
  }

  def isEven(x:Int):Boolean = x%2 == 0
}
