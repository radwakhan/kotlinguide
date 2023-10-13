fun main() {
//lazy initialization- is used when creating an object is expensive means takes more time or space
val user1=User6("radwa","khan",6)
//val user2=User6("taha","khan",5)
//lets initialize user2 with lazy initializer
    val user2 by lazy {
        User6("user1","last name",0)
    }
    println(user2.firstName)
}
class User6(var firstName:String,var lastName:String,var age:Int){
    init {
        println("user: $firstName was created")
    }
}
