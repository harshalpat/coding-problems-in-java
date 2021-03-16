package harshal;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1,"harshal");
		m.put(2,"patel");
		m.put(3,"working");
		m.put(4,"development");

		// Iterator object is used to loop through the HashMap (collections)
		Iterator it = m.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // print one item at a time!
		}
	}
}
