import com.horstman.corejava.Employee;
import com.horstman.corejava.Manager;
import static java.lang.System.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee staff[] = new Employee[3];
        Manager boss = new Manager("Carl", 80000, 1987, 12, 15);
        boss.setBonus(500);

        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony", 40000, 1990, 3, 15);

        for(Employee e : staff)
            out.println(e.getName() + " " + e.getSalary());
    }
}
