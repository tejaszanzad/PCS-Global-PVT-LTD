package enums;

public class Enum3 {
	
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enum inside for loop
		for (Level myVar : Level.values()) {
		      System.out.println(myVar);
		}

	}

}
