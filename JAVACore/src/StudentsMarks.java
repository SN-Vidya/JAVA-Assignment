import java.util.Scanner;
public class StudentsMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.println("enter the marks of a");
		a=sc.nextDouble();
		
		System.out.println("enter the marks of b");
		b=sc.nextDouble();
		
		System.out.println("enter the marks of c");
		c=sc.nextDouble();
		
		if(a>60 && b>60 && c>60){
		
			System.out.println("passed");
		
		}else if((a>60 && b>60)||(a>60 && c>60)||(b>60 && c>60)){
			System.out.println("Promoted");
			
		}else if(((a>60)&&(b<60||c<60))||((b>60)&&(a<60||c<60))||((c>60)&&(a<60||b<60))||(a<60 && b<60 && c<60)){
			System.out.println("Failed");
		
		}

	}

}
