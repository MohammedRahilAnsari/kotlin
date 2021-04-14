fun main() {

    val windows = Windowss()
    println(windows.operatingSystem())
    println(windows.buildYear())
    println(windows.buildBy())


}

interface Computers {

    fun operatingSystem(): String
    fun buildYear(): Int

    fun buildBy() = "ABC"

}

interface Type {
    fun dummyType()
}

class Windowss() : Computers, Type {

    override fun operatingSystem(): String {
        return "Windows"

    }

    override fun buildYear(): Int {
        return 2001
    }

    override fun dummyType() {

    }

}