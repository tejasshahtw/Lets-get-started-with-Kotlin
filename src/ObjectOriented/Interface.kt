package ObjectOriented

interface VehicleInterface{
    fun drive()
    fun wash(){
        println("Washing the vehicle")
    }
}

interface BuildableInterface{
    var timeRequired: Int
    fun build()
    fun wash(){
        println("Washing the car while it is being built")
    }
}

class Car(var color:String):VehicleInterface, BuildableInterface{

    override var timeRequired: Int = 50

    override fun drive() {
        println("Driving a $color car")
    }

    override fun build() {
        println("Building a $color car")
    }

    override fun wash() {
        super<BuildableInterface>.wash()
    }
}

fun main() {
    val car=Car("Red")
    car.build()
    car.drive()
    car.wash()
}