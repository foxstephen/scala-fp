package fox.scala.fp.algebra

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MonoidTest extends AnyFunSuite with FpTest {

  test("IntMonoid applying identity yields same element i.e 0 + 99 == 99") {
    val intMonoid = new IntMonoid
    assertResult(99)(intMonoid.binaryOp(99, intMonoid.id))
  }

  test("StringMonoid applying identity yields same element i.e \"\" + \"hello!\" == \"hello!\"") {
    val stringMonoid = new StringMonoid
    assertResult("hello!")(stringMonoid.binaryOp("hello!", stringMonoid.id))
  }
}
