object Main {
  val name = "Alex"

  def main(args: Array[String]): Unit =
    println("Hello " + name)
}

/*
  // functions
  (x:Int, y: Int) => x + y // anonymous

  val add = (x: Int, y: Int) => x + y

  // method
  def add2(x: Int, y: Int):Int = x + y

  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int =
    (x + y) * multiplier

  println(addThenMultiply(1, 2)(3)) // 9

  //classes
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = println(prefix + name + suffix)
  }

  val greeter = new Greeter("Hello, ", "!")
  greeter.greet("Scala developer") // hello, Scala developer!


  // case classes
  case class  Point(x: Int, y: Int)
  //immutables instances
  val point = Point(1, 2)
  val point2 = Point(1, 2)
  val pointNotEqual = Point(2, 2)

  // objects
  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }

  val newId: Int = IdFactory.create()
  println(newId) //1
  val newerId: Int = IdFactory.create()
  println(newerId) // 2

  //Traits
  trait  Greeter2 {
    def greet(name: String): Unit
    // default implementation
    def greetWithImplementation(name: String): Unit = println("Hello, " + name)
  }
 */




