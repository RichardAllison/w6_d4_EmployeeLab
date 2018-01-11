import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Employee("John", "PC323056C", 23000);
    }

    @Test
    public void hasName() {
        assertEquals("John", employee.getName());
    }

}
