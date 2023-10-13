fun main(){
    val calculator=Calculator.sum(5,4)
//    val max=Int.MAX_VALUE //this is also public companion object
    println(calculator)

//    how to do it without creating the object
}
class Calculator(){
//    companion object similar to static member. they are
//    tied to class rather than instance of class.
    companion object{
        fun sum(a:Int,b:Int):Int{
            return a+b
        }
    }

}