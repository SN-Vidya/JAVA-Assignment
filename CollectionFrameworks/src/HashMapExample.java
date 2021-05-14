import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,String> emp=new HashMap<String,String>();
		emp.put("20/1/2000", "anu");
		emp.put("12/9/1998", "vidya");
		emp.put("20/1/1997", "sahana");
		emp.put("15/5/2015", "bindu");
		
		for(Map.Entry<String,String> m : emp.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
