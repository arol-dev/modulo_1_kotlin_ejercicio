package javalang;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String code;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public String toString() {
        return "Department { " + "code = " + code + ", name = " + name + ", employees = \n" + employees + " }";
    }
}
