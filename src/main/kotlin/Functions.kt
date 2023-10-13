fun main(){
    sayHello("radwa",21)
    val hasInternetcon=true
    if(hasInternetcon)
        getData("some data")
    else
        showmessage()
}

fun sayHello(name:String,age:Int){
//    age=30 here we can't change their value here cause they're val
   var number=age
    println("hello $name and your age is $age")
}

fun getData(data:String){
    println("your data is: $data")
}

fun showmessage(){
    println("there is no internet")
}