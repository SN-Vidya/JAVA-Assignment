abstract class Shape { 
	abstract void draw();

}
class Line extends Shape{
	void draw() {System.out.println("drawing lines");}
}

class Rectangle extends Shape{
	void draw() {System.out.println("drawing Rectangle");}
}

class Cube extends Shape{
	void draw() {System.out.println("drawing cube");}
}

class TestAbstraction1{
	public static void main(String args[]) {
		Shape s=new Line();
		s.draw();
		
		Shape s1=new Rectangle();
		s1.draw();
		
		Shape s2=new Cube();
		s2.draw();
	}
}