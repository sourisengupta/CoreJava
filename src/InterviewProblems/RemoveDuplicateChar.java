package InterviewProblems;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I love my country, IndiaIndiaIndiaIndia";
		
		String updString = removeDuplicateChar(str);
		System.out.println("The orginal String: "+str);
		System.out.println("The updated String: "+updString);
	}
	public static String removeDuplicateChar(String str)
	{
		
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder result = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(set.add(c)) {
				result.append(c);
			}
		}
		return result.toString();
	}
}
