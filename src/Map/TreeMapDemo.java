package Map;

import java.util.Map;
import java.util.TreeMap;


// Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
// Java TreeMap contains only unique elements.
// Java TreeMap cannot have a null key but can have multiple null values.
// Java TreeMap is non synchronized.
// Java TreeMap maintains ascending order.

public class TreeMapDemo {
	public static void main(String[] args) {		
		Map <Integer, String> tree = new TreeMap<Integer, String>();
		
		tree.put(2, "DEF");
		tree.put(1, "ABC");		
		tree.put(3, "XYZ");
		tree.put(4, "XYZ");
		
		for(int t : tree.keySet()) {
			System.out.println("Values are: "+ tree.get(t));
		}
	}
}
