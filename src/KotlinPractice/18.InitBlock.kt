fun main() {

    val block = InitBlock("Rahil",23)


}

class InitBlock (val name:String){

    init {          // init = initializer

        // initializer value
        println("initializer called")

    }

   constructor(fullName:String, age:Int):this(fullName){
       println("secondary constructor")

   }

}