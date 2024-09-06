package Map;

import java.util.Set;
import java.util.TreeSet;
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order.
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quite fast.
//Java TreeSet class doesn't allow null elements.
//Java TreeSet class is non-synchronized.
//Java TreeSet class maintains ascending order.
//The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set <String> tree = new TreeSet<>();
		
		tree.add("sda");
		tree.add("sda");
		tree.add("sda");
		tree.add("sddbfa");
		tree.add("sdaasd");
		tree.add("sdaad");
		tree.add("sdbdvgfa");
		
		
		for(String st : tree) {
			System.out.println("Values are : "+ st);
		}
	}
}
