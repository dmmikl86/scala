object rationals {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  x - y - z
  z + z + y
  x < y
  x max y
  //val strange = new Rational(1, 0)
  new Rational(2)
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonZero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int  = if(b == 0) a else gcd(b, a % b)
  val g = gcd(x, y)
  val numer = x / g
  val denom = y / g

  def + (that: Rational): Rational =
    new Rational (
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def - (that: Rational): Rational = this + -that

  def unary_- :Rational = new Rational(-numer, denom)

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this < that) that else this

  /*def neg: Rational = new Rational (-numer, denom)
  def sub(that: Rational): Rational = add(that.neg)*/

  override def toString(): String =
    numer + "/" + denom

}
