fun main(){
val car1=Car("  tesla","S Plaid","Red",4) //instantiation
//car1.color="red"
//   car1.name="tesla"
//   car1.model="S Plaid"
//   car1.doors=4
   println("name = ${car1.name}")
   println("model = ${car1.model}")
   println("color = ${car1.color}")
   println("doors = ${car1.doors}")
   car1.move()
   car1.stop()
println("\n")
   val car2=Car("Ford","Mustang","blue",4) //argument
//   car2.name="Ford"
//   car2.model="Mustang"
//   car2.color="blue"
//   car2.doors=4
   println("name = ${car2.name}")
   println("model = ${car2.model}")
   println("color = ${car2.color}")
   println("doors = ${car2.doors}")
}
//to create constructor we simply put parenthesis in class name
class Car(name:String,var model:String,color:String,doors:Int){ //parameter
//  if we put datatype name on parameter it become property
   var name=name.trim()  //remove extra spaces


   //   var model=model
   var color=color //property name
   var doors=doors

   fun move(){
      println("the car $name is moving")
   }
   fun stop(){
      println("the car $name has stopped")
   }
}