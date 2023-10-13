fun main(){
    var number=0
    while (number<10){
        number++
//        if(number==6){
//            continue
//        }
        if(number==6){
            break
        }
        println(number)
    }
    println("for loop")
    for(i in 0..10){
        if(i in 3..8){
            continue
        }
        println(i)
    }
}