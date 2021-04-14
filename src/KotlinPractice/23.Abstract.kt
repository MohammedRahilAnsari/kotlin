fun main() {

    //Abstract

    val windows = Windows()
    val mac = Mac()

  //  println(windows.operatingSystem())
  //  println(mac.operatingSystem())

    println(getOperatingSystem(windows))
    println(getOperatingSystem(mac))

}

fun getOperatingSystem(computer: Computer) = computer.operatingSystem()


abstract class Computer() {

    abstract fun operatingSystem() : String

}

class Windows() : Computer() {

    override fun operatingSystem() : String {
        return "Windows"

    }

}

class Mac() : Computer(){

    override fun operatingSystem(): String {
        return "Mac"

    }

}
