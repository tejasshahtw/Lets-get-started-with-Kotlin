package Collections

fun main() {
    var nameAgeMap = mapOf(Pair("John", 25), Pair("Jane", 30))
    println(nameAgeMap.keys)
    println(nameAgeMap.values)
    println(nameAgeMap)

    nameAgeMap.forEach {
        println("${it.key} is ${it.value} years old")
    }
}