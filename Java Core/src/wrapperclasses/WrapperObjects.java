package wrapperclasses;

public class WrapperObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating objects of corresponding wrapper classes
		Integer myInt = 100; 
		Float myFloat = 5.99f;
	    Double myDouble = 5.99; 
	    Character myChar = 'A'; 
	    Boolean myboolean = true;
	    
	    //Printing values of wrapper objects
	    System.out.println("Printing values of wrapper objects");
	    System.out.println(myInt);
	    System.out.println(myFloat);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	    System.out.println(myboolean);
	    
	    //Printing values of wrapper objects using intValue() method
	    System.out.println("Printing values of wrapper objects using intValue() method");
	    System.out.println(myInt.intValue());
	    System.out.println(myFloat.floatValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    System.out.println(myboolean.booleanValue());
	    
	    //Converting Integer to String using toString() method and use the length() method to output the length of the string
	    System.out.println("Converting Integer to String using toString() method and use the length() method to output the length of the string");
	    String myString = myInt.toString();
	    System.out.println("Length is " + myString.length());

	}

}
