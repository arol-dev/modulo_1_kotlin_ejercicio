package javalang;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create Department object
        Department department = new Department("D01", "Sistemas");

        // Create Employee objects
        Employee employee1 = new Employee("Juan", "Perez", 30, 1000, 5);
        Employee employee2 = new Employee("Maria", "Lopez", 25, 1200, 3);
        Employee employee3 = new Employee("Pedro", "Gomez", 35, 1500, 8);
        Employee employee4 = new Employee("Ana", "Torres", 40, 2000, 10);
        Employee employee5 = new Employee("Luis", "Ramirez", 45, 2500, 15);

        // Add Employee objects to Department object
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
        department.addEmployee(employee4);
        department.addEmployee(employee5);

        // Print Department object
        System.out.println(department);

        // Print Average Salary of Employees
        System.out.println("Calcular Salario Promedio: " + calculateAverageSalary(department.getEmployees()));

        // Print Employees Filtered by Age
        System.out.println("Filtrar Empleados por Edad: " + filterEmployeesByAge(department.getEmployees(), 30));

        // Increase Salary of Employees
        increaseSalary(department.getEmployees());
        System.out.println(department);

        // Print Employee 1
        System.out.println(employee1);

        // Print Employee Classification
        System.out.println("Clasificar Empleado: " + classifyEmployee(employee1));

        // Print Salary Increase
        System.out.println("Calcular Aumento de Salario: " + calculateIncrease(employee1));
    }

    public static double calculateAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public static List<Employee> filterEmployeesByAge(List<Employee> employees, int minimumAge) {
        return employees.stream()
                .filter(employee -> employee.getAge() >= minimumAge)
                .collect(Collectors.toList());
    }

    public static void increaseSalary(List<Employee> employees) {
        employees.forEach(
                employee ->
                        employee.setSalary(employee.getBaseSalary() + (employee.getBaseSalary() * 0.1 * employee.getYearsWorked()))
        );
    }

    public static String classifyEmployee(Employee employee) {
        if (employee.getYearsWorked() >= 0 && employee.getYearsWorked() <= 2) {
            return "Junior";
        } else if (employee.getYearsWorked() >= 3 && employee.getYearsWorked() <= 5) {
            return "Mid";
        } else {
            return "Senior";
        }
    }

    public static double calculateIncrease(Employee employee) {
        if (employee.getYearsWorked() >= 1 && employee.getYearsWorked() <= 3) {
            return employee.getBaseSalary() * 0.05;
        } else if (employee.getYearsWorked() >= 4 && employee.getYearsWorked() <= 6) {
            return employee.getBaseSalary() * 0.1;
        } else if (employee.getYearsWorked() >= 7 && employee.getYearsWorked() <= 10) {
            return employee.getBaseSalary() * 0.15;
        } else {
            return employee.getBaseSalary();
        }
    }

}
