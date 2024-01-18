package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101,"Java");
		hm.put(102,"Python");
		hm.put(103,"Devops");
		System.out.println("The Elements Of The HashMap Are");
		System.out.println(hm);
		
	for(Entry<Integer, String> m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	}

}
