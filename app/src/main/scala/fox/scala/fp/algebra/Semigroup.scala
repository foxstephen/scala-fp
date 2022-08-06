package fox.scala.fp.algebra

/**
 * A semigroup is an algebraic structure which is closed and whose binary operation is associative.
 * See [[https://proofwiki.org/wiki/Definition:Semigroup]]
 *
 * Associativity = (((a + b) + c) + d) == (a + (b + (c + d)))
 *
 */
trait Semigroup[A] extends Magma[A] {
}

class IntSemigroup extends IntMagma with Semigroup[Int] {
}

class StringSemiGroup extends StringMagma with Semigroup[String] {
}


