package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DSetHashSetTreeSetDemo {
	public static void main(String[] args) {
		/*
		 * It represents the unordered set of elements which doesn't allow us to store the duplicate items. 
		 * We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
		 */
		
		Set<String> sNames = new HashSet<String>();
		sNames.add("Souri");
		sNames.add("Nabanita");
		sNames.add("Shriya");
		sNames.add("Ashima");
		
		sNames.remove("Ashima");
		sNames.add("Sengupta");
		
		
		// Two Ways to loop through the collection
		Iterator it = sNames.iterator();
		// 1.
		while(it.hasNext()) {			
			System.out.println(it.next());
		}
		//2.
		for(Iterator<String> it1=sNames.iterator();it1.hasNext();) {
			System.out.println(it1.next());
		}		
		//3.		
		for(String str: sNames) {
			System.out.println(str);			
		}
		
		System.out.println("==============================");
		// TreeSet is a sorted HashSet
		Set<Integer> sInt = new TreeSet<Integer>();
		sInt.add(4);
		sInt.add(8);
		sInt.add(2);
		sInt.add(11);
		
		for(int i:sInt) {System.out.println(i);}
		
		
	}
}
