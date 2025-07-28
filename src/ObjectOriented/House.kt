package ObjectOriented

class House(val height: Int, val width: Int, var color: String,val price: Int=100000) {

    fun printDetails(){
      println("House details: Height: $height, Width: $width, Color: $color, Price: $price")
    }
}

fun main() {
    val redHouse=House(10,20,"Red",200000)
    redHouse.printDetails()

    val blueHouse=House(width = 5, height = 10, color = "Blue")
    blueHouse.printDetails()

}