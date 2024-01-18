package oops;

//Multiple Inheritance Using Interfaces
interface Father{
	float HT = 6.2f;
	void display();
}

interface Mother{
	float HT = 5.8F;
	void display();
}

class Child implements Father, Mother{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		//child got the average height of the parents
		float ht = (Father.HT+Mother.HT)/2;
		System.out.println("Childs Height "+ht);
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child();
		obj.display();
	}

}
