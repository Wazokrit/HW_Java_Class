public class Manager extends SalaryEmployee {
    private double bonuses;

    public double getBonuses() {
        return this.bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    public Manager(int id, String name, int age, double salary, double bonuses) {
        super(id, name, age, salary);
        this.bonuses = bonuses;
    }






    public double calcSalary() {
        return this.getSalary() + this.getSalary() * (100.0 / this.bonuses);
    }

    public String toString() {
        return super.toString() + " Salary = " + this.calcSalary();
    }
}
