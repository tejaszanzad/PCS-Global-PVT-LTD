package collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(501,"Alex");
		ht.put(502,"Raj");
		ht.put(503,"Jay");
		ht.put(504,"Mendu");
		ht.put(505,"Krish");
		System.out.println("The Elements Of The HashTable Are");
		System.out.println(ht);
		
		for(Entry<Integer, String> m : ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
