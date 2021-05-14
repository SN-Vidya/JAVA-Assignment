import java.util.ArrayList;
public class Movie_DetailsList {

	public static void main(String[] args) {
		ArrayList<String> movies=new ArrayList<String>();
		movies.add("Titanic");
		movies.add("Superman");
		movies.add("He-Man");
		movies.add("ABC");
		
		System.out.println("Movies name:"+ movies);
		
		movies.add(4,"XYZ");
		System.out.println(movies);
		
		movies.remove(3);
		
		System.out.println(movies);
		
		
		ArrayList<String> genre=new ArrayList<String>();
		genre.add("comedy");
		genre.add("action");
		genre.add("fiction");
		genre.add("suspense");
		
		System.out.println("Genre;"+ genre);
		
		genre.removeAll(genre);
		
		System.out.println(genre);
		
		ArrayList<String> actor=new ArrayList<String>();
		actor.add("manu");
		actor.add("nikil");
		actor.add("vijay");
		actor.add("ajay");
		
		System.out.println("Actor name:"+ actor);
		
		ArrayList<String> actress=new ArrayList<String>();
		actress.add("ramya");
		actress.add("samantha");
		actress.add("aishwarya");
		actress.add("genilia");
		
		System.out.println("Actress name:"+ actress);
		
		
				
		

	}

}
