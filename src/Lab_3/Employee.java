package Lab_3;
import java.util.*;
public class Employee implements UniversityMember{
    private int acctNO;
    public ArrayList<Support> supports;
    public ArrayList<CourseExecution> cE;

    public Employee(){
        super();
    }

    public int getAcctNO(){
        return acctNO;
    }

}
