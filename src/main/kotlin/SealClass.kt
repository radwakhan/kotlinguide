fun main(){
val success=Result.Success("SUCCESS")
val error=Result.Success("ERROR")
    val progress=Result.Progress("PROGRESS")
    getData(progress)
}
fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress->result.showMessage()
//        is Result.Error.RecoverError->result.showMessage()
//        is Result.Error.NonRecoverError->result.showMessage()


    }
}
sealed class Result(val message:String){
    fun showMessage(){
        println("result : $message")
    }
    class Success(message: String):Result(message)
    sealed class Error(message: String):Result(message){
        class RecoverError(exception: java.lang.Exception,message: String):Error(message)
        class NonRecoverError(exception: java.lang.Exception, message: String):Error(message)
    }
    class Progress(message: String):Result(message)
}












//enum class Result{
//    SUCCESS,
//    ERROR();
//}in enum classes we can't define properties'