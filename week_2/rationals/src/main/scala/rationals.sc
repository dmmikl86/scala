object rationals {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  x - y - z
  y + z
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def +(that: Rational): Rational =
    new Rational (
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def -(that: Rational): Rational =
    new Rational (
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  /*def neg: Rational = new Rational (-numer, denom)
  def sub(that: Rational): Rational = add(that.neg)*/

  override def toString(): String =
    numer + "/" + denom

}
