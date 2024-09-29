package kotlinlang

class Employee(var name: String, var lastName: String, var age: Int, var baseSalary: Double, var yearsWorked: Int) {
    var salary: Double = 0.0

    override fun toString(): String {
        return "Employee { name = $name, lastName = $lastName, age = $age, baseSalary = $baseSalary, yearsWorked = $yearsWorked, salary = $salary }\n"
    }
}
