package InterviewProblems;

import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {
	public static void main(String args[]) {
		String text = "Lapotop";
		text = text.toLowerCase();
		checkUniqueChar(text);
		char[] cText = text.toCharArray();
		// Using set collection
		Set<String> set = new HashSet<>();
		for (int i = 0; i < cText.length; i++) {
			int lenChar = text.replaceAll(Character.toString(cText[i]), "").length();
			if (text.length() - lenChar > 1) {
				// System.out.println("Duplicate found for "+ cText[i]);
				set.add(Character.toString(cText[i]));
			}
		}
		for (String str : set) {
			System.out.println("Duplicate found for " + str);
		}
		// Using map collection
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < cText.length; i++) {
			if (!map.containsKey(cText[i])) {
				map.put(cText[i], 1);
			} else {
				map.put(cText[i], map.get(cText[i]) + 1);
			}
		}
		for (Character key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println("Duplicate found for " + key);
			}
		}
		
		findDuplicateChar("abcdabcdhdsladhlasdnkacnansxcnacsnlcasknalcsnalscnk caklnjasckna");
		findDupCharacter("abcdabcdasdfjasbcjasbcnjnascxaslcnlasn");
	}

	// Find the unique character from a string
	public static void checkUniqueChar(String text) {
		char[] charText = text.toCharArray();
		int len;
		for (char ch : charText) {
			len = text.replaceAll(Character.toString(ch), "").length();
			if (text.length() - len == 1) {
				System.out.println(ch);
			}
		}
	}
	
	public static void findDuplicateChar(String text) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<text.length();i++) {
			if(!map.containsKey(text.charAt(i))) {
				map.put(text.charAt(i), 1);
			}
			else {
				map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
			}
		}
		
		for(char key: map.keySet()) {
			if(map.get(key) > 1) {
				System.out.println("Key: "+key+" Count: "+map.get(key));
			}
			
		}
		
	}
	
	public static void findDupCharacter(String text) {
		
		Set<Character> texts = new HashSet<>();
		for(int i=0;i<text.length();i++) {
			for(int j=i+1;j<text.length();j++) {
				if(text.charAt(i) == text.charAt(j)) {
					texts.add(text.charAt(i));
					break;
				}				
			}			
		}
		
		Iterator<Character> it = texts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
