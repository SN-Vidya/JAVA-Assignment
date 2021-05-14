
public class MethodOverridingMain {

	public static void main(String[] args) {
		Labour l1=new Labour(1,"Arpit" ,20000);
       
        Manager m1=new Manager(1,"Amit" ,30000);
        
 
        System.out.println("Name of Employee:" +l1.getEmployeeName()+"---"+"Salary:"+l1.getSalary());
        
        System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
       
    }


	}


