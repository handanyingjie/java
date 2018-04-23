import java.util.Date;

class Employee {
    private Date hireDay = new Date();
    public Date getHireDay(){
        return (Date) hireDay.clone();
    }
}
public class ep1_5 {
    public static void main(String args[]){
        Employee harry = new Employee();
        Date d = harry.getHireDay();
        double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        d.setTime(d.getTime() - (long) tenYearsInMilliSeconds);
    }
}
