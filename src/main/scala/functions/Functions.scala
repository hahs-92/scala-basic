package functions

object Functions {

  def add(a: Int, b: Int): Int = a + b

  def addWithFunction(a: Int, b: Int, cb: (Int, Int) => Int): Int = a + b + cb(2, 1)

  def multiplyBy2(a: Int):Int = a * 2

  def addAndMultiplyBy2(a: Int, b: Int): Int =
    multiplyBy2(add(a, b))

  def addSeveralParams(a: Int, b:Int)(c: Int): Int = a + b + c

  def addOne(a: Int): Int = a + 1

  def isPair(list:List[Int]) : List[Int] = list.filter(_ % 2 == 0)

  def currying1(a: Int) = (b: Int) => a + b

  def currying2(a: Int): (Int)=> Int = {
    (b: Int) => a + b
  }

  def createFunc(): () => Unit = {
    var name = "Alex"
    () => println(name)
  }

  def adder(x: Int): (Int) => Int = {
    (y: Int) => x + y
  }

}
