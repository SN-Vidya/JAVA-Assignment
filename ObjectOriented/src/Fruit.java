
abstract class Fruit {
	void eat() {System.out.println("Fruit eat() called");}
}
class  Apple extends Fruit{
}

class MainJava{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple i=new Apple();
		i.eat();
		

	}

}
