package javalang;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private double baseSalary;
    private int yearsWorked;
    private double salary;

    public Employee(String name, String lastName, int age, double baseSalary, int yearsWorked) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.baseSalary = baseSalary;
        this.yearsWorked = yearsWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee { " + "name = " + name + ", lastName = " + lastName + ", age = " + age + ", baseSalary = " + baseSalary + ", yearsWorked = " + yearsWorked + ", salary = " + salary + " }\n";
    }

}
