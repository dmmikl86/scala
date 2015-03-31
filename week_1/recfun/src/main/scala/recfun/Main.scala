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
    def checkBalance(l: List[Char], count:Int):Int = {
      if (l.isEmpty)
        count
      else if (l.head == '(')
        checkBalance(l.tail,count + 1)
      else if(l.head == ')' && count > 0)
        checkBalance(l.tail,count - 1)
      else
        checkBalance(l.tail, count)
    }
    if(chars.count(_.equals('(')) == chars.count(_.equals(')'))) checkBalance(chars, 0) == 0 else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(m: Int, c: List[Int]) : Int = {
      if (c.isEmpty) 0
      else if (m - c.head == 0) 1
      else if (m - c.head < 0) 0
      else countChange(m - c.head, c) + countChange(m, c.tail)
    }
    count(money, coins.sorted)
  }
}
