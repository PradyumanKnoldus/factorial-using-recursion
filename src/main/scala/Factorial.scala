import scala.annotation.tailrec

object Factorial extends App {

  // A tail-recursive method to calculate the factorial of a number
  @tailrec
  def factorial(number: Int, accumulator: BigInt = 1): BigInt = {

    if (number < 0) throw new IllegalArgumentException("Input must be a non-negative integer.")
    else if (number <= 1) accumulator
    else factorial(number - 1, number * accumulator)
  }
}
