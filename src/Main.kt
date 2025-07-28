//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    printWithSpaces("Hello")
    var list = listOf(0,1,2,3,4,5,6,7,8)
    var reversedList = reverseList(list)
    println(reversedList)
}

fun printWithSpaces(text:String) {
//    for (character in text) {
//        print("$character ")
//    }
    print(min(15,10))
}

fun min(a:Int,b:Int):Int{
    if(a<b){
        return a
    }
    return b
}

fun reverseList(list:List<Int>):List<Int> {
    var reversedList = arrayListOf<Int>()
    for(i in list.size-1 downTo 0){
        reversedList.add(list.get(i))
    }
    return reversedList
}