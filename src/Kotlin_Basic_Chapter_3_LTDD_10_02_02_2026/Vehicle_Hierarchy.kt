package Kotlin_Basic_Chapter_3_LTDD_10_02_02_2026

import java.time.Year

class Vehicle_Hierarchy() {
    open class Vehicle(var make:String = "",
                       var model:String = "",
                       var fuelType:Int = 0,
                       var year: Year= Year.now()) {

        open fun calculating_fuel_efficiency( distance_traveled: Int): Int{
            var fuel_efficiency: Int = (fuelType / distance_traveled) * 100
            return fuel_efficiency
        }
        open fun calculating_distance_traveled( time: Int , speed: Int ): Int {
            return time * speed
        }
        open fun calculating_maximum_speed(distance_traveled: Int , time: Int): Int {
            return distance_traveled / time
        }
        open fun showVehicleDetails(){
            println("Make $make model $model")
        }
    }

    class Truck() : Vehicle() {
    }
    class Car : Vehicle() {
    }
    class Motorcycle() : Vehicle() {
    }
}

fun main() {
    var distance = 100
    var time = 2
    var speed = 50

    var car = Vehicle_Hierarchy.Car()
    car.make = "Toyota"
    car.model = "Camry"
    car.fuelType = 10
    car.showVehicleDetails()
    println("Car's Fuel Effience : " + car.calculating_fuel_efficiency(distance))
    println("Car's Distance Travelled : " + car.calculating_distance_traveled( time, speed ))
    println("Car's Maximum Speed : " +car.calculating_maximum_speed(distance, time ))

    var truck = Vehicle_Hierarchy.Truck()
    truck.make = "Ford"
    truck.model = "F-150"
    truck.fuelType = 8
    truck.showVehicleDetails()
    println("Truck's Fuel Effience : " + truck.calculating_fuel_efficiency(distance))
    println("Truck's Distance Travelled : " + truck.calculating_distance_traveled( time, speed ))
    println("Truck's Maximum Speed : " +truck.calculating_maximum_speed(distance, time ))

    var motorcycle = Vehicle_Hierarchy.Motorcycle()
    motorcycle.make = "Harley"
    motorcycle.model = "Street 750"
    motorcycle.fuelType = 15
    motorcycle.showVehicleDetails()
    println("Motorcycle's Fuel Effience : " + motorcycle.calculating_fuel_efficiency(distance))
    println("Motorcycle's Distance Travelled : " + motorcycle.calculating_distance_traveled( time, speed ))
    println("Motorcycle's Maximum Speed : " +motorcycle.calculating_maximum_speed(distance, time ))
}