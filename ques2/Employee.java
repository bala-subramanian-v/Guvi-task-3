// Employee class
class Employee implements Taxable {

    int empId;
    String name;
    double salary;

    // Constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Calculate income tax on yearly salary
    public double calcTax() {
        return salary * incomeTax;
    }
}
