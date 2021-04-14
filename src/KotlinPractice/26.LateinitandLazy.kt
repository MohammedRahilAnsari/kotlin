fun main() {

    //Note lateinit and lazy both don't take the null value

    /*
    // lateinit variable are always mutable variables so we use var keyword
    val declaration = Declaration()
    declaration.setValue("Rahil")
    println(declaration.getValue())
    */

    // lazy variable are immutable variables so we use val keyword

    val user: UserDetails by lazy { UserDetails("Rahil","23") }
    println(user.toString())

}

class Declaration {

    lateinit var myName: String

    fun setValue(name: String) {
        myName = name
    }

    fun getValue() = if (::myName.isInitialized) myName else "Not Initialized"
}

class UserDetails(val name :String,val age:String) {

    init {
        println("The name is $name")
        println("The age is $age")
    }

}