package functions
import functions.Functions._

object FunctionMain {
  def main(args: Array[String]): Unit = {
    println(add(2,6))

    // : indica el tipo
    val f : (Int, Int) => Int = add
    val f2 = (a: Int, b: Int) => a + b

    println("function with method " + addWithFunction(1,1, add ))
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

    var myList = List( 2, 4, 5, 6 ,7)
    println(isPair(myList))

    // currying
    val c1 = currying1(2)
    val rsC1 = c1(2)

    val c3 = currying1(2)(_)
    val rsC3 = c3(3)

    println("currying1: " + rsC1)
    println("currying2. " + currying1(2)(2))
    println("currying3: " + rsC3)
    println("currying2: " + currying2(2)(2))


    //closure
    val myFunction = createFunc()
    myFunction()

    val add5 = adder(5)
    val add10 = adder(10)

    println("closure2: " + add5(2))
    println("closure3: " + add10(2))
    println("closure + currying: " + adder(10)(2))


    //funciones parciales y totales
    val myList2 = List(1,3,56,7,75)

    println(myList2.take(1))

  }

}
