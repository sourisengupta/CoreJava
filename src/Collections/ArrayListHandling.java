package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHandling {
	public static void main(String args[]) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Two");
		al1.add("One");
		al1.add("Three");
		al1.add("Five");
		al1.add("Four");
		System.out.println("1. Displaying al1 ["+al1+"]");
		al1.add("Six");
		System.out.println("2. Displaying al1 ["+al1+"]");
		al1.remove(5);
		System.out.println("3. Displaying al1 ["+al1+"]");
		System.out.print("4. Displaying al1 [");
		for (String str:al1) {
			System.out.print(str);
			System.out.print(",");
		}
		System.out.println("]");
		//add an string in the index 2
		al1.add(1,"Nine");
		System.out.println("5. Displaying al1 ["+al1+"]");
		System.out.println("2nd index of ArrayList="+al1.get(2)); //Get the value of index 2
		System.out.println("2nd index of ArrayList="+al1.size()); //Size of the ArrayList
		System.out.println("Check if Five is present="+al1.contains("Five")); //Check the presence of value in the ArrayList
		System.out.println("Check if Five is present="+al1.contains("Six")); //Check the presence of value in the ArrayList
		
		//Sorting the arraylist
		Collections.sort(al1);
		System.out.println("6. Displaying al1 ["+al1+"]");
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println("7. Displaying al1 ["+al1+"]");
	}	
}
