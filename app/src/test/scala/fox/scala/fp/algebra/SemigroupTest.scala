package fox.scala.fp.algebra

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SemigroupTest extends AnyFunSuite with FpTest {

  test("IntSemigroup is associative e.g ((((1 + 2) + 3) + 4) + 5) ==  (1 + (2 + (3 + (4 + 5))))") {
    assertIsAssociative(List(1, 2, 3, 4, 5))(new IntSemigroup)(15)
  }

  test("StringSemiGroup is associative ((hello + world) + !) == (hello + (world + !))") {
    assertIsAssociative(List("hello", "+", "world", "!"))(new StringSemiGroup)("hello+world!")
  }
}
