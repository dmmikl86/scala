package example

import org.scalatest.FunSuite

class ListsTest extends FunSuite {
  test("calculate sum of List"){
    val list: List[Int] = List(1, 2, 3, 4, 5, 6)
    assert(Lists.sum(list) == 21)
  }
  test("find min value of List"){
    assert(Lists.max(List(1, 2, 3, 4, 5, 6)) == 6)
  }
}
