public class Employees extends AppleCompany{
    private int age;
    private int salary;
    private String position;

    public Employees() {
    }

    public Employees(int id, String name, String surname, int age, int salary, String position) {
        super(id, name, surname);
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
