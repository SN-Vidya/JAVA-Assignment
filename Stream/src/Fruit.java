import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.Comparator;
import java.util.stream.Collectors;

  class Fruits {
	String name;
	int calories;
	int price;
	String color;
	
	public Fruits(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return"Fruits[name="+name+", calories="+calories+",price="+price+",color="+color+"]";
	}
	
	
	public static void main(String[] args) {
		ArrayList<Fruits> fruits = new ArrayList<Fruits>();
		
		fruits.add(new Fruits("Apple", 52, 200, "Red"));
		fruits.add(new Fruits("Orange", 105, 350, "Orange"));
		fruits.add(new Fruits("Grapes", 80, 170, "Green"));
		fruits.add(new Fruits("Banana", 67, 105, "Yellow"));
		fruits.add(new Fruits("Strawberry", 110,500,"Red"));
		fruits.add(new Fruits("Dragon fruit",262,112,"Pink"));
		
		List<Fruits> fruitsSortedList1= fruits.stream().sorted((o1,o2) -> (int)(o2.getCalories() - o1.getCalories())).collect(Collectors.toList());
		System.out.println(fruitsSortedList1);
		
		List<Fruits> fruitsSortedList2 = fruits.stream().sorted(Comparator.comparingLong(Fruits::getCalories).reversed()).collect(Collectors.toList());
		System.out.println(fruitsSortedList2);
		System.out.println("-----------------------------------");
		
		fruits.stream().sorted((f1,f2) ->f1.color.compareTo(f2.color))
		.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		fruits.stream().filter(c ->c.color =="Red")
		.forEach(System.out::println);
		System.out.println("-----------------------------------");
		
		List<Integer>caloriesList2=fruits.stream()
				.filter(f->f.calories<100)
				.map(f->f.calories)
				.collect(Collectors.toList());
		System.out.println(caloriesList2);
		
		System.out.println("-----------------------------------");
		
		List<Fruits> outList= fruits.stream().filter( c->c.calories < 100).sorted(Comparator.comparing(Fruits::getCalories).reversed()).collect(Collectors.toList());
		System.out.println(outList);
		
		System.out.println("-----------------------------------");
		List<Fruits> outList1 = fruits.stream().filter(a->a.color=="Red").sorted(Comparator.comparing(Fruits::getCalories).reversed()).collect(Collectors.toList());
		System.out.println(outList1);
		
		
		
		
		
	}
			
		
	}
	
	
	
	
	



