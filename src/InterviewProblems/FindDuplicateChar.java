package InterviewProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {
	
	public static void main(String args[]) {
		
		String text="Lapotop";		
		text= text.toLowerCase();
		char[] cText = text.toCharArray();
		
		//Using set collection
		Set<String> set = new HashSet<>();		
		for(int i=0;i<cText.length;i++) {
			int lenChar=text.replaceAll(Character.toString(cText[i]), "").length();
			if(text.length() - lenChar > 1) {
//				System.out.println("Duplicate found for "+ cText[i]);
				set.add(Character.toString(cText[i]));
			}
		}
		
		for(String str : set) {
			System.out.println("Duplicate found for "+ str);
		}
		
		//Using map collection
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i =0;i<cText.length;i++) {
			if(!map.containsKey(cText[i])) {
				map.put(cText[i], 1);
			}
			else {
				map.put(cText[i], map.get(cText[i])+1);
			}			
		}
		
		for (Character key: map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println("Duplicate found for "+ key);
			}
		}
	}
}
