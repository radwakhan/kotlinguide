fun main(){
//    inheritance- create a class using another class and use it's properties and create new properties
   val car=Carr("BMW","Red",1,4)
   val plane=Plane("boeing","white",4,4)
    car.stop()
    plane.move()

}
//the class which will inherited should be open
open class vehical (val name:String,val color:String){
   open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name has stopped")
    }
}

class Carr(name: String,color: String, val engine:Int,val doors:Int):vehical(name,color){

}
class  Plane(name: String,color: String,val engine:Int,val doors:Int):vehical(name,color){
    override fun move() {
        super.move() //super means call something from base class
    flying()
    }
    fun flying(){
        println("the plane is flying")
    }
}