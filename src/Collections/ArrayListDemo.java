package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * List interface is the child interface of Collection interface. 
		 * It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.
		 * It maintains the insertion order
		 * List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack(LIFO).
		 */
		
		List<String> lNames = new ArrayList<String>();
		lNames.add("Souri");
		lNames.add("Nabanita");
		lNames.add("Shriya");
		lNames.add("Ashima");
		
		lNames.remove("Ashima");
		lNames.add("Sengupta");
		
		
		// Two Ways to loop through the collection
		Iterator it = lNames.iterator();
		// 1.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//2.
		for(Iterator<String> it1=lNames.iterator();it1.hasNext();) {
			System.out.println(it1.next());
		}
		// 3. 
		for(String str:lNames) {
			System.out.println(str);
		}
		
		
		
	}
}
