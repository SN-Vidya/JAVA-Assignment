import java.util.HashSet;
public class Employee1 {


	    String name;
	    int age;

	    public Employee1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this)
	            return true;
	        if (!(obj instanceof Employee1))
	            return false;
	        Employee1 employee = (Employee1) obj;
	        return employee.getAge() == this.getAge()
	                && employee.getName() == this.getName();
	    }

	       
	      @Override
	        public int hashCode() {
	            int result=17;
	            result=31*result+age;
	            result=31*result+(name!=null ? name.hashCode():0);
	            return result;
	        }
	     
	}



 class ClientTest {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("rajeev", 24);
        Employee1 employee1 = new Employee1("rajeev", 25);
        Employee1 employee2 = new Employee1("rajeev", 24);

        HashSet<Employee1> employees = new HashSet<Employee1>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
        + "  employee2.hashCode():" + employee2.hashCode());
    }
}


