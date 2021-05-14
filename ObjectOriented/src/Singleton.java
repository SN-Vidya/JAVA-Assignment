
public class Singleton {
	 private static Singleton single_instance=null;
	 
	 public String s;
	 
	 private Singleton()
	 {
		 s="Hello Singleton Class";
	 }
	 
	 public static Singleton getInstance()
	 {
		 if(single_instance==null)
			 single_instance=new Singleton();
		 
		 return single_instance;
	 }

}
