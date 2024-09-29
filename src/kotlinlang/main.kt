package kotlinlang

fun main() {
    // Create Department object
    val department = Department("D01", "Sistemas")

    // Create Employee objects
    val employee1 = Employee("Juan", "Perez", 30, 1000.0, 5)
    val employee2 = Employee("Maria", "Lopez", 25, 1200.0, 3)
    val employee3 = Employee("Pedro", "Gomez", 35, 1500.0, 8)
    val employee4 = Employee("Ana", "Torres", 40, 2000.0, 10)
    val employee5 = Employee("Luis", "Ramirez", 45, 2500.0, 15)

    // Add Employee objects to Department object
    department.addEmployee(employee1)
    department.addEmployee(employee2)
    department.addEmployee(employee3)
    department.addEmployee(employee4)
    department.addEmployee(employee5)

    // Print Department object
    println(department)

    // Print Average Salary of Employees
    println("Promedio de Salarios de Empleados: " + department.employees.calculateAverageSalary())

    // Print Employees Filtered by Age
    println("Filtrar Empleados por Edad: /n" + department.employees.filterEmployeeByAge(30))

    // Increase Salary of Employees
    department.employees.increaseSalary(10.0)
    println(department)

    // Print Employee 1
    println(employee1)

    // Print Employee Classification
    println("Clasificar Empleado: " + classifyEmployee(employee1))

    // Print Salary Increase
    println("Calcular Aumento de Salario: " + calculateIncrease(employee1))
}

fun List<Employee>.calculateAverageSalary(): Double {
    return this.map { it.salary }.average() ?: 0.0
}

fun List<Employee>.filterEmployeeByAge(minimumAge: Int): List<Employee> {
    return this.filter { it.age >= minimumAge }
}

fun List<Employee>.increaseSalary(percentage: Double) {
    forEach { employee ->
        employee.salary = employee.baseSalary + ( employee.baseSalary * percentage / 100 * employee.yearsWorked)
    }
}

fun classifyEmployee(employee: Employee): String {
    return when (employee.yearsWorked) {
        in 0..2 -> "Junior"
        in 3..5 -> "Mid"
        else -> "Senior"
    }
}

fun calculateIncrease(employee: Employee): Double {
    return when (employee.yearsWorked) {
        in 1..3 -> 0.05
        in 4..6 -> 0.1
        else -> 0.15
    } * employee.baseSalary
}