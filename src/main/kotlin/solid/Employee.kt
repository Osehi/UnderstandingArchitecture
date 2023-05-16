package solid

// 16-May-2023
class Employee {

    // this class - solid.Employee has two(2) responsibilities.
    //  By the Single Responsibility Rule
    // A class should have one and only one reason to change.

    fun calculatePay(money: Double): Double { // this is a business logic
        return money
    }

    fun save(employee: Employee) : Employee { // this logic is a persistence logic
        return employee
    }
}