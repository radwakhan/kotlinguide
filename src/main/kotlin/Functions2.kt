fun main(){
   val max= getMax(5,9)
    println(max)
}
fun getMax(a:Int,b:Int):Int{
//val max=if(a>b) a else b
//    return max

//if(a>b){
//    return  a
//}else
//    return b
    return if (a>b) a else b
}
//or a single line code

fun getMin(a:Int,b:Int)=if(a<b)b else a
