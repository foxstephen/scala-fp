package fox.scala.fp.algebra

/**
 * A Monoid is a Semigroup with an identity element. (see [[https://proofwiki.org/wiki/Definition:Monoid]])
 *
 * A monoid is a set that is closed under an associative binary operation and has an identity element I in S such that
 * for all a in S, Ia=aI=a. In other words using an identity element (I) with any other element (a) in the binary
 * operation returns the element (a).
 *
 *
 * @tparam A The element.
 */
trait Monoid[A] extends Semigroup[A] {
  val id: A
}

class IntMonoid extends IntSemigroup with Monoid[Int] {
  override val id: Int = 0
}

class StringMonoid extends StringSemiGroup with Monoid[String] {
  override val id: String = ""
}