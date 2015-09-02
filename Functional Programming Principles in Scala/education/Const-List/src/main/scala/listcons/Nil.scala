package listcons

/**
 * Created by mdmytiaha on 24-Apr-15.
 */
class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  def head: Nothing = throw new NoSuchElementException("Nil.head")
}
