fun main(){
val text:String?=null
    println(text)
//    println(text.length)
//    now it says maybe the above could have null value so we need to check first before asking for length
//if(text!=null)
//    println(text.length)
//    else
//        println("the variable is null")

//there is one more alternate method to do that
    println(text?.length)
//    the above is work same if text is not null then print length
//    the above is called safe operator
//    println(text!!.length)
//    the above will throw null pointer if there is null in the
    var t:String?=null
    var text2=t?:"this is null"
    println(text2)
//    longer way below to write
    if(t!=null)
        text2=t
    else
        text2="this is not null"
    println(text2)


}
//    null value when we assign a var null and when we do some arithmatic expression with them so run time it will show exception
//    so due to this the app could crash so kotlin make sure to handle it and not make your app crash
