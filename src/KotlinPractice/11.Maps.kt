fun main() {
    //maps = key/value pair
    val ageMapper = mapOf("Rahil" to 23, "Goku" to 30)
    /*println(ageMapper)
    println(ageMapper.size)
    println(ageMapper.count())*/
    /*println(ageMapper.count {
        it.value->28
    })*/

    //mutable mapof

    val newAgeMapper = mutableMapOf("Rahil" to 23,"Goku" to 30)
    newAgeMapper.put("doe",35)
    newAgeMapper.put("Naruto",25)

    println(newAgeMapper)
    newAgeMapper.remove("Rahil")
    println(newAgeMapper)

    println(newAgeMapper.containsKey("Goku"))
    println(newAgeMapper.containsValue(35))
    println(newAgeMapper.filter { it.key == "Doe" || it.value == 30})
    println(newAgeMapper.filterKeys { it == "Naruto" })
    println(newAgeMapper.filterKeys { it == "Naruto" })
    println(newAgeMapper.filterValues { it == 25 })
    println(newAgeMapper.toSortedMap())


}