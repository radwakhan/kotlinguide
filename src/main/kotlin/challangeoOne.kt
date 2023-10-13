fun main() {
//    var number = 1
//    val lastNumber = 20
//    var evenNumCounter=0
//    while (number <= lastNumber) {
//        number++
//        if (!isEven(number)){
//            continue
//        }
//        evenNumCounter++
//        println(number)
//    }
//    println("total even number are $evenNumCounter")

//    doing the same with the help of forLoop
    var counter=0
    for(i in 1..20){

        if(i%2!=0){
            continue
        }
        counter++
        println(i)
    }
    println(counter)
}

//fun isEven(number: Int)= (number % 2) == 0
//simplified boolean expression
