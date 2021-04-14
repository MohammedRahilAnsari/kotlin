fun main() {

    //return type lambda
    val square: (Int) -> Int = { number ->
        number * number
    }
    println(square(5))

    //non return type but performing certain action inside it's body
    val printName: (String) -> Unit = {
        println(it)
    }

    printName("Rahil")
}