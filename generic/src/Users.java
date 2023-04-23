public class Users {
    private int salary;

    public Users(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Users{" +
                "salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }
}
