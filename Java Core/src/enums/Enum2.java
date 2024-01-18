package enums;

public class Enum2 {
	
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enum inside switch statement
		Level myVar = Level.MEDIUM; 
        
	    switch(myVar) {
	      case LOW: 
	    	System.out.println("Low level");
	        break;
	      case MEDIUM:
	        System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }

	}

}
