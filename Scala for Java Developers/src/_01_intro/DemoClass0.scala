package _01_intro

import scala.beans.BeanProperty

object DemoClass0 extends App {
  println("Hello")
  val person0 = new Person0
  person0.age
  person0.age = 5
  person0.age_=(4)
  person0.age_$eq(45)

  val person1 = new Person1
  person1.getAge()
  person1.setAge(43)

  val person2 = new Person2
  person2.age
  person2.getAge
  person2.age = 3
  person2.setAge(34)
  person2.age_=(3)
  person2.age_$eq(5)

  val person3 = new Person3(3)
  person3.age
  person3.getAge
  person3.age = 4
  person3.setAge(5)
  person3.age_=(6)
  person3.age_$eq(6)
}

class Person0 {
  private[this] var privateAge: Int = _

  def age: Int = {
    println("Hello from accessor")
    privateAge
  }

  def age_=(value: Int): Unit = {
    println("Hello from mutator")
    privateAge = value
  }
}

class Person1 {
  private[this] var age: Int = _

  def getAge(): Int = this.age

  def setAge(value: Int): Unit = this.age = value
}


class Person2 {
  @BeanProperty var age: Int = _
}

class Person3(@BeanProperty var age:Int){

}
