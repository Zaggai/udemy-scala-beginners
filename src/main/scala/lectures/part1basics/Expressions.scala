package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4) //mathematical expression
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x) //expression evaluates to a boolean
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //Exercises: 
  // 1. difference between string "hello world" vs println("hello world")?
  // the first is an value of the type String the second is an expression which is a side effect and the type is therefore Unit. 

  // 2.
  //what is the value of this?
  val someValue = {
    2 < 3
  }
  println(someValue)
  //the type is a boolean with the value true

  //what is the value of this?
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
  //the value is 42 with the type Int as that is the last expression in the code block
  //the if line is irrelevant. 

}
