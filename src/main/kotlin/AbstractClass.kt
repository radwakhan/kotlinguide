///we can't create instance of abstract classes they only used to inherited by other classes
fun main(){

}
abstract class Vehicle(){
    val text="some text"
    abstract fun move()
    abstract fun stop()
}
class Caar(var name:String,var Color:String,val engine:Int,val door:Int):Vehicle(){
    override fun move() {
    }

    override fun stop() {
    }

}