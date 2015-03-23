package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(column: Int, row: Int): Int = {
    if (column == 0 || column == row) 1 else pascal(column, row - 1) + pascal(column - 1, row - 1)
  }
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var balance:Int = 0
    def checkBalance(l: List[Char]):Any = {
      if (l.isEmpty) balance else {
        if (l.head == '(') {
          balance = balance + 1
        }
        if (l.head == ')' && balance > 0) {
          balance = balance - 1
        } else {
          if(l.head == ')') {
            balance = -1
            return
          }
        }
        checkBalance(l.tail)
      }
    }
    checkBalance(chars)
    if (balance == 0) true else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
