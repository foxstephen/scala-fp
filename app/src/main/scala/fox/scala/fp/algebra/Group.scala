package fox.scala.fp.algebra

/**
 * A group is a monoid with an inverse [[https://proofwiki.org/wiki/Definition:Group]]
 *
 * @tparam A The element.
 */
trait Group[A] extends Monoid[A] {
  def inverse(a: A): A
}

class IntGroup extends IntMonoid with Group[Int] {
  override def inverse(a: Int): Int = -a
}
