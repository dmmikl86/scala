package demo

import org.scalatest.FunSuite

/**
 * Created by mdmytiaha on 04-Mar-15.
 */
class HelloTest extends FunSuite {
  test("Sey Hello method works correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
