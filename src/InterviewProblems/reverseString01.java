package InterviewProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class reverseString01 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "arg1");
		map.put(3, "arg3");
		map.put(4, "arg4");
		map.put(2, "arg2");
		
		Iterator it = map.entrySet().iterator();
		
		/*while(it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			System.out.println("Key:"+m.getKey()+" | Value:"+m.getValue());
		}*/
		
		for(Map.Entry m: map.entrySet()) {
			
			System.out.println("Key:"+m.getKey()+" | Value:"+m.getValue());
		}
	}
	
}
