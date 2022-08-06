package fox.scala.fp.algebra

import org.scalatest.Assertions.assertResult

trait FpTest {

  def assertIsAssociative[A](elements: List[A])(semigroup: Semigroup[A])(expected: A): Unit = {
    val sum1 = elements.reduceLeft(semigroup.binaryOp)
    val sum2 = elements.reduceRight(semigroup.binaryOp)

    assertResult(expected)(sum1)
    assertResult(expected)(sum2)
  }

}
