public class MainEmployee {
    public MainEmployee() {
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(12345, "Petr", 25, 2365.0, 50.0);
        Manager m2 = new Manager(12555, "Val", 43, 4567.0, 20.0);
        SalaryEmployee s1 = new SalaryEmployee(5326, "Lio", 69, 3654.1);
        SalaryEmployee s2 = new SalaryEmployee(536726, "Pazo", 42, 37854.1);
        WageEmployee w1 = new WageEmployee(12987, "John", 34, 35.2, 36);
        WageEmployee w2 = new WageEmployee(1295887, "Johnson", 40, 45.2, 56);
        Employee[] emp = new Employee[]{m1, m2, w1, w2, s1, s2};
        print(emp);
        System.out.println("----------------------------------");
        printAdv(emp);
        System.out.println("----------------------------------");
        printSuperAdv(emp);
        System.out.println("----------------------------------");
    }

    public static void print(Employee[] emp) {

        int i=1;
        for (Employee e:emp){
            System.out.println("Employee "+i+" " + e);
        i++; }

   }



    public static void printAdv(Employee[] emp) {
        double totalSal = 0.0;
        int i=1;
        for (Employee e:emp){
           totalSal+=e.calcSalary();
            System.out.println("Employee "+i+" " + e);
        i++;    }


        System.out.println("---------------------");
        System.out.println("Total Salary =  " + totalSal);}


    public static void printSuperAdv(Employee[] emp) {
        double totalSal = 0.0;
        int i = 1;

        for (Employee e:emp){
            totalSal+=e.calcSalary();
            System.out.println("Employee "+i+" " + e);
            i++;    }


        System.out.println("---------------------");
        System.out.println("Total Salary =  " + totalSal);

        System.out.println("---------------------");
               System.out.println("Average Salary = " + totalSal/(i-1) );}
    }

