fun main() {
//    val isPlaying=true
//    val score=80
//    if (isPlaying && score==80){
//        println("next level opened")
//    }else{
//        println("still at the same level")
//    }

    val num1 = 5
    val num2 = 4
    if (num1 > 0 || num2 > 0) {
        println("the condition is true")
    } else {
        println("the condition is false")
    }

//    or
    val text = if (num1 > 0 || num2 > 0)
        "the condition true text1"
    else
        "this condition false text2"
    val text2 = if (num1 > 0 || num2 > 0) "the condition true text1" else 5
//    val text3:String =if(num1>0||num2>0) "the condition true text1" else 5
//if we define the datatype then we can't use the other condition different datatype
    println(text)
}