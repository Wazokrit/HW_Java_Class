public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public SalaryEmployee(int id, String name, int age) {
        super(id, name, age);
    }

    public double calcSalary() {
        return this.salary;
    }

    public String toString() {
        return super.toString() + " Salary=" + this.salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }

    }
}

