package harshal;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) {
		
		// HashSet collections stores values in unordered form 
		HashSet<String> set = new HashSet<String>();
		set.add("Harshal");
		set.add("is");
		set.add("on");
		set.add("roll!");

		// prints the values irrespective of insertion order
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
