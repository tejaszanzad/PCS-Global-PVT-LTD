package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(10);
		set.add(20);
		System.out.println(set);
	}

}
