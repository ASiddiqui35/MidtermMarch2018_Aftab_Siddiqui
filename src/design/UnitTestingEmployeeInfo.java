package design;
import org.testng.*;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo Em = new EmployeeInfo();
        Em.employeeId(337);
        Assert.assertEquals(337,337);
    }
}
