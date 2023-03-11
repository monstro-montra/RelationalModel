fun main(){
    /*
    The following is a representation of relational models. There are two drivers who happen to be related to each other through some sort of bond and happened to agree to share a car.
    Terrence has a carList that consists of only one car, a Toyota Corolla.
    Sonya has a carList that consists of two cars; the same Toyota Corolla that Terrence has, and a Mazda6.
    This shows both a one-to-one relationship and a one-to-many relationship
    One-to-one: Terrence only owns one car
    One-to-many: The Toyota Corolla is owned by both Terrence and Sonya
     */

    val terrence = Driver(430432315, "Terrence") // instantiate a driver named "Terrance"
    val sonya = Driver(43043216, "Sonya") // instantiate a driver named "Sonya"

    terrence.carList.add(element = Car(134, "Corolla", "Toyota", "Sedan", 32  )) //add a toyota corolla to terrence's list of cars
    sonya.carList.add(element = terrence.carList[0]) //add terrence's toyota corolla to sonya's list of cars
    sonya.carList.add(element = Car(532, "6", "Mazda", "Sedan", 33))

    println("Hi! My name is ${terrence.name}. I'm going to drive my ${terrence.carList[0].make} ${terrence.carList[0].model}!") //terrance speaking in this context. he's going to drive his toyota corolla
    terrence.drive(terrence.carList[0]) //call the drive function on the first car in terrence's list of cars
    println("I have reached my destination.")
    terrence.brake(terrence.carList[0]) //call the brake function

    println() //empty line

    println("Hi! My name is ${sonya.name}. I'm going to Terrence's ${sonya.carList[0].make} ${sonya.carList[0].model} because I actually own it too!") //sonya speaking in this context. she's going to terrence's  toyota corolla
    sonya.drive(sonya.carList[0]) //call the drive function on the first car in sonya's list of cars

    println("Hold on. I don't want to drive this car so let me head back. It's a good thing I have another one.") //sonya speaking, saying that she will drive her other car.
    sonya.brake(sonya.carList[0])
    println("I'm going to drive my ${sonya.carList[1].make} ${sonya.carList[1].model} instead!")
    sonya.drive(sonya.carList[1]) //call drive function
    println("I have reached my destination.")
    sonya.brake(sonya.carList[1]) //call brake function
}