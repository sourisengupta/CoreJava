package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfWordsInAString {
	public static void main(String args[]) {
		String message = "I stay at Nashua. I love Nashua. I love sports";
		
		Map<String,Integer> map = new HashMap<>();        //Declaring a hashMap with the type of key and value
		String[] arrMessage = message.split(" ");
		
		for(int i=0; i<arrMessage.length;i++) {
			if(!map.containsKey(arrMessage[i])) {  //ContainsKey method will check the key is present in value provided.
				map.put(arrMessage[i], 1);         //Insert into map
			}
			else {
				map.put(arrMessage[i], map.get(arrMessage[i])+1);
			}			
		}
		for(String str: map.keySet()) {
//			System.out.println("The count of "+str+" is "+map.get(str));
			System.out.println("The count of "+str+" is "+map.get(str));
		}
		
		
	}
}
