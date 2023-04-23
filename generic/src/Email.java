import java.util.Comparator;

public class Email implements Comparator<Users> {
    @Override
    public int compare(Users o1, Users o2) {
        return ((o1.getSalary() == o2.getSalary())
                ? 0
                : o1.getSalary() < o2.getSalary() ? -1 : 1);
    }
}
