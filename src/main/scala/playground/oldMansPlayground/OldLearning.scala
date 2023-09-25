object OldLearning extends App{

    def fact (number : Int): Int = 
        if (number <= 1) 1
        else {
            println("Computing factorial of " + number + " - I first need factorial of " + (number - 1))
            number * fact (number - 1)
        }


    println(fact(50))

}
