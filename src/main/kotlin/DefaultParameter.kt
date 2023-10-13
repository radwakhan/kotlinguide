fun main(){
    sendMessage("radwa")
    sendMessage(message = "hello everyone", name = "radwa")
}
fun sendMessage(name:String,message:String="default message"){
    println("name: $name message: $message")
}

fun sendText():String{
    return "some text"
}
//or
fun sendingText()="sending some texts"