fun main(){
val radwaAccount=Account("radwa")
    radwaAccount.deposit(1000)
    radwaAccount.withdraw(500)
    radwaAccount.deposit((-20))
    radwaAccount.withdraw(-100)
    val balance=radwaAccount.calculateBalance()
    println("balance is $balance")
}
class Account(val accountName:String){
//    we making them private so we can't change them outside of the class
   private var balance=0
   private var transections= mutableListOf<Int>()

    fun deposit(amount:Int){
        if(amount>0){
            transections.add(amount)
            balance+=amount
            println("$amount deposited. balance is now ${this.balance}")
        }else{
            println("cannot deposite negative number")
        }
    }
    fun withdraw(withdraw:Int){
        if(-withdraw<0){
            transections.add(-withdraw)
            this.balance+= -withdraw
            println("$withdraw withdraw from account current balance is ${this.balance}")
        }else{
            println("cannot withdraw negative money")
        }
    }

    fun calculateBalance():Int{
        this.balance=0
        for(transection in transections){
            this.balance+=transection
        }
        return  this.balance
    }
}