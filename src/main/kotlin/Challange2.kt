fun main(){
//val max=maxNum(arrayOf(3,5,2,1,7,8,6))
//    val min=minNum(arrayOf(2,3,4,1,5,6,8))
//    println("max num $max")
//    println("min num $min")

    val max=finMinMax(arrayOf(2,3,45,6,3,45,2,46,76,98),true)
println("max marks $max")
    val min=finMinMax(arrayOf(2,34,5,2,4,1,3,4),false)
    println("min marks $min")
}
//to combine both man and min in one function
fun finMinMax(number: Array<Int>,searchMax:Boolean):Int {
    var max = number[0]
    var min = max
    if (searchMax) {
        for (num in number) {
            if (num > max) {
                max = num
            }
        }
        return max
    } else {
        for (num in number) {
            if (num < min) {
                min = num
            }
        }
        return min
    }
}






//fun maxNum(numbers : Array<Int>):Int{
//    var max= numbers[0]
//    for(number in numbers){
//        if(number>max){
//            max=number
//        }
//    }
//    return max
//}
//
//fun minNum(num:Array<Int>):Int{
//    var n=num[0]
//    for (i in num){
//        if(i<n){
//            n=i
//        }
//    }
//    return n
//}
