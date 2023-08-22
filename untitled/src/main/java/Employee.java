public class Employee implements Methods {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0)
           this.id = id;
       else this.id = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.length() == 0)
            this.name = "Empty";
        else this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else this.age = 0;
    }

    @Override
    public double calcSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
