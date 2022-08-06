package fox.scala.fp.algebra

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GroupTest extends AnyFunSuite with FpTest {

  test("IntGroup inverse is the additive inverse i.e -4 is the inverse of 4 and vice verse") {
    assertResult(4)(new IntGroup().inverse(-4))
    assertResult(-4)(new IntGroup().inverse(4))
  }
}
