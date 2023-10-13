//using intializer block
fun main(){
var user=User("radwa","khan",21)
    val friend=User("annie","khan",17)
println(user.name)
    println(friend.name)
}
class User(name:String,var lastName:String,var age:Int){
//creating initializer block
    var name:String


    init {
        if(name.lowercase().startsWith("a")){
            this.name=name
        }else{
            this.name="User"
            println("the name doesn't start with the leter a or A")
        }
    }


}
