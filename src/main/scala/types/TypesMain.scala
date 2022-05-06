package types

object TypesMain {

  def main(args: Array[String]): Unit = {

    val myList = Types.createList()

    println(myList)

    // casting
    var numberString = "9"
    var number = numberString.toInt

    println(numberString + numberString)
    println(number + number)

    var numberDouble: Double = 12.6
    var numberInteger: Int = numberDouble.toInt
    var numberLong: Long = numberInteger

    println(numberInteger)
    println(numberLong)
  }

}
