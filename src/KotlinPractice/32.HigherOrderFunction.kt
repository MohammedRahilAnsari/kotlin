fun main() {
    //Higher order function
    //takes function as parameter and returns a function

    //function as a parameter example
    val addition = DoAddition()
    println(addition(22, 22))

    //parameter as a function example
    printMyName {
        println("Rahil")
    }

    printName {
        println(it)
    }
}

fun DoAddition(): (Int, Int) -> Int {
    return ::addition
}

fun addition(numone: Int, numtwo: Int) = numone.plus(numtwo)

//parameter as a function example

fun printMyName(print: () -> Unit) {
    print()
}

fun printName(print: (String) -> Unit) {
    print(String)
}
