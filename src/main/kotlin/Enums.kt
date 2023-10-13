fun main(){
//    enums are constant but are more powerful
//    println(Direction.WEST)
//    println(Direction.EAST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)

    for (direction in Direction.values()){
        println(direction)
        println("$direction direction is ${direction.distance}")
        println("$direction distance is ${direction.distance}")
        println(direction.name)
    }
    println(Direction.SOUTH.printdata())
}
enum class Direction(var direction:String,var distance:Int){
    NORTH("north",34),
    SOUTH("south",43),
    EAST("east",56),
    WEST("west",23);

//    these are instances of enum class
    fun printdata(){
        println("$direction and distance is $distance")
    }
}