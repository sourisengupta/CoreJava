package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CLinkedListDemo {
	public static void main(String[] args) {
		/*
		 * It uses a doubly linked list internally to store the elements. 
		 * It can store the duplicate elements. It maintains the insertion order 
		 * and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.
		 */
		
		List<String> lNames = new LinkedList<String>();
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
		
		//3.
		
		for(String str: lNames) {
			System.out.println(str);			
		}
		
		
		
	}
}
