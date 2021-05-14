import java.util.Scanner;
public class UserPass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String user,pass;
		int count;
		for(count=0;count<=2;count++) {
		 
		System.out.print("Enter your username: ");
		user=sc.nextLine();
		
		System.out.print("Enter your password: ");
		pass=sc.nextLine();
		
		if(user.equals("vidya") && (pass.equals("hassan"))) {
			System.out.println("Welcome vidya");
			
				
		
			System.out.println("contact admin");
		}
		}
		

	}

}
