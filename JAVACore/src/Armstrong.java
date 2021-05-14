
public class Armstrong {

	public static void main(String[] args) {
		int sum=0,r,temp=0;
		int n=153;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
          if(sum==temp)
        	  System.out.println("armstrong number");
          else
        	  System.out.println("not armstrong number");
	}

}
