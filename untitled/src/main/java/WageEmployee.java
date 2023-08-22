public class WageEmployee extends Employee {
    private double hourPrice;
    private int hours;

    public WageEmployee(int id, String name, int age, double hourPrice, int hours) {
        super(id, name, age);
        this.setHours(hours);
        this.setHourPrice(hourPrice);
    }



    public double getHourPrice() {
        return this.hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        if (hourPrice > 0.0) {
            this.hourPrice = hourPrice;
        } else {
            this.hourPrice = 0.0;
        }

    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        if (hours > 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }

    }

    public String toString() {
        return super.toString() + " Salary =" + this.hourPrice * (double)this.hours;
    }

    public double calcSalary() {
        return this.hourPrice * (double)this.hours;
    }
}
