import org.junit.Before;
import techStaff.DatabaseAdmin;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {

        databaseAdmin = new DatabaseAdmin("Me", "999", 20000);
    }
}
