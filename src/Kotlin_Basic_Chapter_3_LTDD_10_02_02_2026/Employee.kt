package Kotlin_Basic_Chapter_3_LTDD_10_02_02_2026
class Employee( var Name: String, var jobTitle: String, var Salary: Double ) {
    fun decreaseSalary( update : Double ) {
        Salary += update
    }
    fun increaseSalary( update : Double ) {
        Salary += update
    }
    fun showDetails() {
        println(Name)
        println(jobTitle)
        println(Salary)
    }
}

fun main() {
    var Truong = Employee("Truong" , "unemploy" , 0.0 )
    var Sang = Employee("Sang" , "unemploy" , 0.0 )
    var Khanh = Employee("Khanh" , "unemploy" , 0.0 )

    var employeeList = arrayListOf<Employee>( Truong , Sang , Khanh )
    employeeList.forEach { it.increaseSalary(1000000.0) }
    employeeList.forEach { it.showDetails() }
}