fun main() {

    //generic means creating your own set of code/ event/ class to perform certain task
/*
    Event<String>("Rahil")
    Event<String>()
    Event(123)
    Event(true)
*/
    Events("Rahil", "1235", 23)

}

class Event<T>(value: T? = null) {

    init {
        if (value != null)
            println(value.toString().length)
        else println("Empty Parameter")
    }

}

class Events<T, N, A>(name: T? = null, number: N? = null, age: A? = null) {
    init {
        if (name != null) {
            println(name.toString().length)
        } else println("Empty Parameter")
        if (number != null) {
            println(number.toString().length)
        } else println("Empty Parameter")
        if (age != null) {
            println(age.toString().length)
        } else println("Empty Parameter")
    }


}