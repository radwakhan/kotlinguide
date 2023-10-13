fun main(){
val user=User4("radwa","khan",5)
    user.favouriteMovie="Interstaller"
    println(user.favouriteMovie)
}

class User4(var firstName:String,var LastName:String,var age: Int){
    lateinit var favouriteMovie:String
//    lateinit refers to the property that initialize later
}