fun main() {
    //enumberation - enum
    val studentone = Student("Rahil",StudentType.MALE)
    val studenttwo = Student("XYZ",StudentType.FEMALE)

    for (type in StudentType.values()) {

        println(type.name)
        println(type.ordinal)
    }

}

class Student(val name :String, val type: StudentType){
    init {
        println("$name is ${type.type}")
    }
}

enum class StudentType(val type:String){
    MALE("male"),
    FEMALE("female")
}