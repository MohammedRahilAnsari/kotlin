fun main() {

    val number = 10
    number.airthmetic(20)

    "ali".midValue()
}

fun Int.airthmetic(number: Int) {
    println("Addtion is ${this + number}")
    println("Subtraction is ${this - number}")
    println("Division is ${this / number}")
    println("multiplication is ${this * number}")
}

fun String.midValue() {
    if (this.length % 2 == 0) {
        println("It has no mid value")
    } else println(this[this.length % 2])
}