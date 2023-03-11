//note: classes in kotlin have getters and setters are auto-generated if you don't need to create them for your program.

sealed class Vehicle { //this class is the top-level class
    abstract var vehicleID: Int
    abstract var model: String
    abstract var make: String
}

data class Car ( //extension of the Vehicle class
    override var vehicleID: Int = 0,
    override var model: String = "defaultValue",
    override var make: String = "defaultValue",
    var carType: String = "defaultValue",
    var fuelEfficiency: Int = 0
) : Vehicle() {
    fun move(){ //function used for moving the car
        println("Car is now moving!")
    }
    fun stop(){ //function used for stopping the car
        println("Car is now stopped.")
    }
}

data class Truck ( //extension of the Vehicle class
    override var vehicleID: Int = 0,
    override var model: String = "defaultValue",
    override var make: String = "defaultValue",
    var towingCapacity: String = "defaultValue",
    var payloadCapacity: Int = 0
) : Vehicle() {
    fun move(){ //function used for moving the truck
        println("Truck is now moving!")
    }
    fun stop(){ //function used for stopping the truck
        println("Truck is now stopped.")
    }
}
