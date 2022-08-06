package fox.scala.fp.algebra

/**
 * A magma is an algebraic structure which is closed under a binary operation. Closed means applying the binary op on an
 * element of type A returns a result of type A. e.g. summing two integers returns an integer e.g. 1 + 1
 *
 * @tparam A The element.
 */
trait Magma[A] {

  def binaryOp(a: A, a1: A): A
}

class IntMagma extends Magma[Int] {
  override def binaryOp(a: Int, a1: Int): Int = a + a1
}

class StringMagma extends Magma[String] {
  override def binaryOp(a: String, a1: String): String = a + a1
}

class IntListMagma extends Magma[List[String]] {
  override def binaryOp(a: List[String], a1: List[String]): List[String] = a.concat(a1)
}
