package Map;

import java.util.*;

public class HashMapDemo {
	
	public static void main(String[] args) {
		/*
		 * It doesn't maintain any order.
		 */
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(9, "Souri");
		map.put(11, "Tulika");
		map.put(2, "Nabanita");
		map.put(6, "Shriya"); 
		map.put(1, "Ashima");
	
		/* Entry is the subinterface of Map. So we will be accessed it by Map.
		 * Entry name. It returns a collection-view of the map, whose elements are of this class. 
		 * It provides methods to get key and value.
		 */
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "|" +m.getValue());
		}
	}
}
// Implement https://www.javatpoint.com/java-map
