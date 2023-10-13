fun main(){
    var number=0
    outer@ while (number<5){
        number++
        println(number)

        var i=0
        while (i<5){
            if(i==3) break@outer
            i++
            println("***$i")
        }
    }
}

//to break the outer loop with the help of inner loop we simple
//write outer@ before main loop and wherever we write break just write
//break@outer