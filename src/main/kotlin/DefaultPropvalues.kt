fun main(){
val user1=User3(name="radwa")
    println(user1.lastName) //this actually getting by getter
    println(user1.age)
    println(user1.firstname)
    user1.firstname="radwaaa"
}
class User3(name:String,var lastName:String="last name",var age:Int=0) {
var firstname=name
//    get() {
//        return "first name: $field"
//    }
//    we can also type the above in single line
    get()=field
    set(value) {
        println("this is setter $value")
        field=value
    }
//    the above and below code is same
//    as they are implicit we don't need to write these code
    fun setName(newValue:String){
        this.firstname=newValue
    }
    fun getName():String{
        return  this.firstname
    }
//    this is implicit code which is not necessary to type
}