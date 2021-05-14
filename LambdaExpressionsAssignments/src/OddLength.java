import java.util.*;
public class OddLength {

	public static void main(String[] args) {
		ArrayList<String> students =new ArrayList<String>();
		
		students.add("Ram");
		students.add("sham");
		students.add("Vijay");
		students.add("manu");
		students.add("arun");
		students.removeIf(n -> (n.length() % 2 ==1));
		
		System.out.println("Students name does not have odd length");
		
		for(String str : students) {
			System.out.println(str);
		}
		

		
	}

}
