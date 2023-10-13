import java.text.FieldPosition

fun main(){
//    inner class are classes that are use inside one class
    val listView=ListView(arrayOf("name1","name2","name3","name4","name5"))
listView.ListViewItem().displayItem(2)
}
class ListView(val items:Array<String>){

    inner class ListViewItem(){
    fun displayItem(position: Int) {
        println(items[position])
    }
    }
}