// Unit Testing

object FactorialTests extends App {

  // Test case 1
  assert(Factorial.factorial(0) == 1)

  // Test case 2
  assert(Factorial.factorial(1) == 1)

  // Test case 3
  assert(Factorial.factorial(6) == 720)

  // Test case 4
  assert(Factorial.factorial(15) == BigInt("1307674368000"))

  // Test case 5
  assert(Factorial.factorial(20) == BigInt("2432902008176640000"))

  // Test case 6
  try {
    Factorial.factorial(-1)
    assert(false, "IllegalArgumentException expected but not thrown")
  } catch {
    case _: IllegalArgumentException => assert(true)
  }

  println("All tests passed!")
}
