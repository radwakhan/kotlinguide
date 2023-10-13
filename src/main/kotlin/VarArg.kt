fun main(){
 println(sum(2,3,4,5))
//    but what if i want to pass more then limited parameter
    println(sub(3,5,6,4,4,5,4))


}

fun sum(a:Int,b:Int,c:Int,d:Int):Int{
    return a+b+c+d
}
fun sub(vararg numbers:Int):Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}
