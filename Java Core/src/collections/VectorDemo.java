package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(15);
		v.add(25);
		v.add(35);
		v.add(1,12);
		v.addElement(45);
		System.out.println("Contents : "+v);
		
		v.remove(2);
		v.removeElement(35);
		System.out.println("Elements After Removing : "+v);
		
	}

}
