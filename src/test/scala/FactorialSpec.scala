import org.scalatest.flatspec.AnyFlatSpec

class FactorialSpec extends AnyFlatSpec {

  "Factorial" should "return 1 for 0" in {
    assert(Factorial.factorial(0) == 1)
  }

  "Factorial" should "return 1 for 1" in {
    assert(Factorial.factorial(1) == 1)
  }

  "Factorial" should "return the correct factorial for positive integers" in {
    assert(Factorial.factorial(7) == 5040)
    assert(Factorial.factorial(10) == 3628800)
    assert(Factorial.factorial(20) == BigInt("2432902008176640000"))
  }

  "Factorial" should "throw an IllegalArgumentException for negative input" in {
    assertThrows[IllegalArgumentException] {
      Factorial.factorial(-1)
    }
  }
}
