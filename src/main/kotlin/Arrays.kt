fun main(){
//    shift+f6 will change the perticluar work from everywhere
    val names : Array<String> =arrayOf("radwa","taha","nimra")
val num= arrayOf(3,5,4,"two","four",'c')
//    these two above sentence are same
    names[0]="aysha"
    println(names[0])
    println(names.size) //3

    for(name in num){
//        println(name) below will only print the certain type
        if(name is Int)
            println(name)
    }
}