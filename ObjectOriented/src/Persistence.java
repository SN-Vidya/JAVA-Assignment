
public abstract class Persistence {
	abstract void persist();
}

class FilePersistence extends Persistence{
	void persist() {System.out.println("File persistence");}
}

class DatabasePersistence extends Persistence{
	void persist() {System.out.println("database persistence");}

}
   
class AbstractMain{
	public static void main(String[] args) {
		Persistence obj= new FilePersistence();
		Persistence obj1=new DatabasePersistence();
		obj.persist();

	}
	}


