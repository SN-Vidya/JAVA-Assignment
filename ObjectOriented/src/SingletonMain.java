
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x=Singleton.getInstance();
		
		Singleton y=Singleton.getInstance();
		
		System.out.println("String from x is"+x.s);
		
		System.out.println("String from y is"+y.s);
		
		System.out.println("\n");
		

		
		
		

	}

}
