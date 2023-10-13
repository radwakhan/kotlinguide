//in kotlin you can define more then one constructor those are called secondary constructor
fun main(){
val user=User2("radwa")
    val user2=User2("radwa","khan")
    println("name= ${user.name}")
    println("name= ${user.lastName}")
    println("name= ${user.age}")

    println("name= ${user2.name}")
    println("name= ${user2.lastName}")
    println("name= ${user2.age}")
}
class User2(var name:String,var lastName:String,var age:Int){
    constructor(name:String):this(name,"lastName",0){
//        this block will run when the secondary constructor runs
        println("2nd")
    }
//here we calling primary constructor from secondary constructor
//    secondary constructor cannot declare new properties
    constructor(name:String,secondName: String):this(name,"last name",5){
        println("3rd")
    }
}