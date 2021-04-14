fun main() {
    val list = listOf("Sumaiya","Sharmeen","Rahil","Mantasha",)

    list.forEachIndexed { index, name ->
        println(index)
        println(name)
    }
}