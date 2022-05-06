package types

object Types {

  def createList(): List[Any] = {
    List(
      "String",
      122,
      'm',
      true,
      () => "myFunction"
    )
  }
}
