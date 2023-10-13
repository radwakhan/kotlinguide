fun main(){
    val alarm=12
    when(alarm){
        12-> println("the time is $alarm")
        7-> println("the time is $alarm")
        14-> println("the time is $alarm")
//  above statement means if alarm is == to any above lhs then the resultant statment print
        13,15,11-> println("this time is $alarm")
//        in above means if the alarm equals to either of any then it equal to resultant statement
       in 1..10-> println("the number is in rage of 1 to 10")
//  the above is in statement if we want to check if the number is in perticular range


        else-> {
           println("the time is $alarm")
        }
    }
//or we can do it like this
    val x=5
    var y=when{
        x<=10->"x is smaller than 10"
        alarm==8||x==5->"the number is $x"
        else->"all statement are false"
    }
    println(y)
}