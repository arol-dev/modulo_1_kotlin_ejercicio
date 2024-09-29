package kotlinlang

class Department {
    var code: String? = null
    var name: String? = null
    var employees: MutableList<Employee> = mutableListOf()

    constructor()

    constructor(code: String?, name: String?) {
        this.code = code
        this.name = name
    }

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun deleteEmployee(employee: Employee) {
        employees.remove(employee)
    }

    override fun toString(): String {
        return "Department { code = $code, name = $name, employees = \n$employees }"
    }
}
