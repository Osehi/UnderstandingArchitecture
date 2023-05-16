package solid.singleresponsibilityprinciple

import solid.Employee

class EmployeeRepository { // this 2nd class handles persistence function.

    fun save(employee: Employee): Employee {
        return employee
    }
}