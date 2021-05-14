import java.util.Scanner;
public class IncomeTax {

	public static void main(String[] args) {
		float income,tax=0;
		System.out.print("Enter the income:");
		Scanner sc=new Scanner(System.in);
		income=sc.nextFloat();

if(income<=180000)
	tax=0;

else if(income<=300000)
	tax=(income-180000)*10/100;
else if(income<=500000)
	tax=(income-300001)*20/100+((10/100)*120000);
else if(income<=1000000)
	tax=(income-500001)*30/100+((10/100)*120000)+((20/100)*200000);


System.out.print("Income tax amount is"+tax);


	

	}

}
