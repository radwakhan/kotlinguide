fun main(){
//    singleton is the design pattern which there is only one instance of one perticular object.
//
//    val instance=Database.getInstance()
//    val instance2=Database.getInstance()
//    println(instance)
//    println(instance2)
println(Database)
println(Database)
}
//class Database private constructor(){
//    companion object{
//        private  var instance:Database?=null
//        fun getInstance():Database?{
//            if(instance==null){
//                instance=Database()
//            }
//            return instance
//        }
//    }
//}
object Database{ //singleton object
    init {
        println("Database created")
    }
}