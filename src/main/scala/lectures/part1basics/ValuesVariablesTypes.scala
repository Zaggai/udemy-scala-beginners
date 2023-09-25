package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // the INT after x: is the type of the value

  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  //difference between values and varibles is that varibles are mutable (they can be modyfied) 
  // varibles are used for side effects (changing a variable is called a side effect)

  aVariable = 5 // side effects
}
