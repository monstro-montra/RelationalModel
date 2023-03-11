data class Driver(
    var driverID: Int,
    var name: String = "defaultValue",
    var carList : MutableList<Car> = mutableListOf()
) {
    fun drive(car: Car){
        println("Starting the ${car.make} ${car.model}!")
        car.move()
    }
    fun brake(car: Car){
        println("Pressing on the brake pedal in the ${car.make} ${car.model}.")
        car.stop()
    }
}
