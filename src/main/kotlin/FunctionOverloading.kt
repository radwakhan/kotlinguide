fun main(){
getMaxx(2,3)
    getMaxx(3.4,3.7)
    getMaxx(4,3,2)

    

}
fun getMaxx(a:Int,b:Int)=if(a>b)a else b
fun getMaxx(a:Double,b:Double)=if(a>b)a else b
fun getMaxx(a:Int,b:Int,c:Int):Int{
    if(a>=b&&a>=b){
        return a
    }
    if(b>=a&&b>=c){
        return b
    }
    else{
        return c
    }
}
