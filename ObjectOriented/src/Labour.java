
public class Labour extends Employee{
	public static int OverTime=4;
	 
    public Labour(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);        
    }
 
    public double getSalary() {
 
        return salary+salary+OverTime;
    }

}
