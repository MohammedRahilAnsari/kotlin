fun main() {

    //Inheriting from ita parent
    val addition = Addition(50, 10, 40)
    println(addition.add())

}

open class BaseAddtion(val num1: Int, val num2: Int) {
    open fun add() = num1.plus(num2)

}

class Addition(val numberone: Int, val numbertwo: Int, val numberthree: Int) : BaseAddtion(numberone, numbertwo) {

    override fun add(): Int{
        return numberone.plus(numbertwo.plus(numberthree))
    }

}