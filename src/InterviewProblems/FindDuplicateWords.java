package InterviewProblems;
import java.util.Map;
import java.util.HashMap;

public class FindDuplicateWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "I love love India india";
		
		String[] arrWords = sentence.toLowerCase().split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String str : arrWords) {
			if(!map.containsKey(str)) {
				map.put(str, 1);
			}
			else {
				map.put(str, map.get(str)+1);
			}
		}
		
		for(String str:map.keySet()) {
			if(map.get(str)>1) {
				System.out.println("Duplicate found for "+str);
			}
		}
	}
}
