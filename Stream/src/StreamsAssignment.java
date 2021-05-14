import java.util.List;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


public class StreamsAssignment {

	public static void main(String[] args) {
		ArrayList<Trader> traders = new ArrayList<Trader>();
		traders.add(new Trader("Jay","Pune"));
		traders.add(new Trader("Roy", "Bangalore"));
		traders.add(new Trader("Ajay", "Chennai"));
		traders.add(new Trader("Tharun", "Delhi"));
		

		Trader vidya =new Trader("vidya","Delhi");
		Trader manu =new Trader("manu","Indore");
		Trader anu =new Trader("anu","Pune");
		Trader bindu =new Trader("bindu","Hassan");
		Trader pooja =new Trader("pooja","Chennai");
		
		
		ArrayList<Transaction> transaction = new ArrayList<Transaction>();
		transaction.add(new Transaction(2010,10000, vidya));
		transaction.add(new Transaction(2011,50000, anu));
		transaction.add(new Transaction(2013,24000, pooja));
		transaction.add(new Transaction(2008,30000, anu));
		transaction.add(new Transaction(2011,45000, manu));
		
		List<Transaction> outList= transaction.stream().filter( y->y.year ==2011).sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
		System.out.println(outList);
		
		System.out.println("-----------------------------------");
		
		List<String> cities = traders.stream().map(c->c.city).collect(Collectors.toList());
		System.out.println(cities);
		
		System.out.println("-----------------------------------");
		
		
		traders.stream().filter(c ->c.city =="Pune")
		.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		traders.stream().sorted((t1,t2) ->t1.name.compareTo(t2.name))
		.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		Trader pune = traders.stream().filter(trader ->"Pune".equals(trader.getCity()))
				.findAny()
				.orElse(null);
		
		System.out.println("-----------------------------------");
		
		
		Comparator<Transaction> comparator = Comparator.comparing(Transaction::getValue);
		
		Transaction minObject = transaction.stream().min(comparator).get();
		
		Transaction maxObject = transaction.stream().max(comparator).get();
		System.out.println("minobject=" + minObject);
		System.out.println("maxobject=" + maxObject);
		
		System.out.println("-----------------------------------");
		

		
		
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
	   

	


