package enums;

public class Enum1 {
	
	//Enum inside the class
     enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Level myVar = Level.LOW; 
	    Level myVar1 = Level.MEDIUM; 
	    Level myVar2 = Level.HIGH;
	    
		System.out.println(myVar); 
		System.out.println(myVar1);
		System.out.println(myVar2);
		
	}

}