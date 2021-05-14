

import java.util.*;
class Persons{
	
	private int weight;
	private String name;
	private int height;
	
	// constructor
	public Persons(int weight,int height, String name)
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getWeight()
	{
		return weight;
	}
	public int getHeight()
	{
		return height;
	}
	
}

class myWeightComparator implements Comparator<Persons>
{
	
	public int compare(Persons p1, Persons p2)
	{
		return p1.getWeight()-p2.getWeight();
		
	}
}

class myHeightComparator implements Comparator<Persons>
{
	public int compare(Persons p1,Persons p2)
	{
		return p1.getHeight()-p2.getHeight();
	}
}

class myNameComparator implements Comparator<Persons>
{
	public int compare(Persons p1, Persons p2)
	{
		return p1.getName().compareTo(p2.getName());
		
	}
}

class TreeSetExample{

	public static void main (String[] args){
		
		
		TreeSet<Persons> set = new TreeSet<Persons>(new myWeightComparator());
		
		set.add(new Persons(45,4,"sam"));
		set.add(new Persons(30,7,"ronaldo"));
		set.add(new Persons(25,6,"daniel"));
		set.add(new Persons(50,9,"george"));
		
		System.out.println("increasing Order with the Weight");
		
		// Printing the TreeSet elements
		for(Persons ele:set)
		{
			System.out.print(ele.getName()+" "+ele.getWeight());
			System.out.println();
		}
		
		
		TreeSet<Persons> heit = new TreeSet<Persons>(new myHeightComparator());
		
        heit.add(new Persons(45,4,"sam"));
		heit.add(new Persons(30,7,"ronaldo"));
		heit.add(new Persons(25,6,"daniel"));
		heit.add(new Persons(50,9,"george"));
		
	
		System.out.println("increasing order with the Height");
		
		for(Persons ele:heit)
		{
			System.out.print(ele.getName() +" "+ ele.getHeight());
			System.out.println();
		}
		
TreeSet<Persons> weigh=new TreeSet<Persons>(new myNameComparator());
		
       weigh.add(new Persons(45,4,"sam"));
	   weigh.add(new Persons(30,7,"ronaldo"));
	   weigh.add(new Persons(25,6,"daniel"));
	   weigh.add(new Persons(50,9,"george"));
		
	
		System.out.println();
		
		for(Persons ele:weigh)
		{
			System.out.print(ele.getName() +" "+ ele.getWeight());
			System.out.println();
		}
		
		

	}
}
