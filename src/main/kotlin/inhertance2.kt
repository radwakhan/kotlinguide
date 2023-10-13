import java.awt.ComponentOrientation

fun main(){
    val vw=view()
    val button=Button("login","center")
    val roundButton=RoundButton("sign up","center",30)
vw.draw()
    button.draw()
    roundButton.draw()
}
open class view(){
    open fun draw(){
        println("drawing the view")
    }
}
open class Button(val text:String,val orientation: String):view(){
    override fun draw() {
//        here is the code for creating the button
        println("drawing the button")
       
    }
}
class RoundButton(text: String,orientation: String,val corner:Int):Button(text,orientation){
    override fun draw() {
        println("drawing the roung button")
        super.draw()
    }
}