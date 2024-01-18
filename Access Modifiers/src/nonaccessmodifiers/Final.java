package nonaccessmodifiers;

public class Final {
	
	final int x = 10;
	final double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Final Obj = new Final();
	   // Obj.x = 50; // will generate an error: cannot assign a value to a final variable
	   // Obj.PI = 25; // will generate an error: cannot assign a value to a final variable
	    System.out.println(Obj.x);

	}

}
