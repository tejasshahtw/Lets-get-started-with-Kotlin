package ObjectOriented

class Vehicle {
    var color:String="Black"
    var maxSpeed:Int=100
    var model:String="Model"

    fun drive(){
        println("Driving")
    }

    fun getCurrentSpeed(speed:Int){
        println("Current speed is $speed")
    } 
}

fun main() {
    var vehicle=Vehicle()
    vehicle.drive()
    vehicle.getCurrentSpeed(100)
    println(vehicle.color)
}