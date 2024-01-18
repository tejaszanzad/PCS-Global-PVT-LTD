package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Making a collection using arraylist
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	  
	    // Generating the iterator
	    Iterator<String> it = cars.iterator();
	  
	    // Printing the items using iterator
	    System.out.println("Printing the items using iterator :");
	    while(it.hasNext()){
	    System.out.println(it.next());
	    }

	}

}
