package _01_intro

object DemoClass1 {
  val person = new Person(age = 30)
}

class Person (var name:String = "Elli", var age:Int)
