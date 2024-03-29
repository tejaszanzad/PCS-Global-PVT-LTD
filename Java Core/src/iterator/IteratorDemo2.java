package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    
		    System.out.println("Printing elements whose value is greater than 10");
		 Iterator<Integer> it = numbers.iterator();
		//Removing items from arraylist whose value is less than 10 using iterator
		    while(it.hasNext()) {
		      Integer i = it.next();
		      if(i < 10) {
		        it.remove();
		      }
		    }
		    System.out.println(numbers);

	}

}
