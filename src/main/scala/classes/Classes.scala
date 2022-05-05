package classes

object Classes {
  def main(args: Array[String]): Unit = {
    val point = new Point(1, 2)
    println(point)

    point.move(10,10)
    println(point)
  }
}
