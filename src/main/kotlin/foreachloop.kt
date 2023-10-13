fun main(){
forEach(4,5,3,5,6,5)
}

fun forEach(vararg num:Int){
    num.forEach { println(it) }
    var sum=0
    for(i in num){
        sum+=i
    }
    println(sum)
}