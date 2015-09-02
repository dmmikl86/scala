package listcons

/**
 * Created by mdmytiaha on 24-Apr-15.
 */
class Cons[T] (val head:T, val tail:List[T]) extends List [T]{
  def isEmpty: Boolean = false
}
