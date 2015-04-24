package listcons

/**
  * Created by mdmytiaha on 24-Apr-15.
  */
trait List[T] {
   def isEmpty: Boolean
   def head: T
   def tail: List[T]
 }
