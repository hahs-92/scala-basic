package functions
import functions.Functions._

object FunctionMain {
  def main(args: Array[String]): Unit = {
    println(add(2,6))

    // : indica el tipo
    val f : (Int, Int) => Int = add
    val f2 = (a: Int, b: Int) => a + b

    println("function with cb: " + addWithFunction( 1, 1, f))
    println("function with cb2: " + addWithFunction( 1, 1, f2))
    println("function with cb lambda: " + addWithFunction( 1, 1, (a, b) => a + b))

    // currying
    // _ => comodin
    val fCurrying = f(5, _)
    println("Currying: " + fCurrying(10))

    //compose Function
    println("Compose " + addAndMultiplyBy2(3,3))

    val composeFunction = multiplyBy2 _ compose addOne
    println("compose: " + composeFunction(2))

    val composeFunction2 = addOne _ andThen multiplyBy2
    println("compose2: " + composeFunction2(2))

    println("Several params: " + addSeveralParams(1,3)(3))
  }

}
