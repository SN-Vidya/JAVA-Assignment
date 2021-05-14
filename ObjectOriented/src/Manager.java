
public class Manager extends Employee{
	public static final double Incentive=1000;
    public Manager(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }
    public double getSalary() {
        return salary+salary+Incentive;
    }
}
