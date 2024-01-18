package nonaccessmodifiers;

public class Static {
	
	  // Static method
	static void StaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void PublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethod(); // Call the static method
	    // PublicMethod(); This would output an error

	    Static Obj = new Static(); // Create an object of class Static
	    Obj.PublicMethod(); // Call the public method
	}

}
