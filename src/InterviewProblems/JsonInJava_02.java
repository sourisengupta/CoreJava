package InterviewProblems;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonInJava_02 {
	public static void main(String args[]) throws ParseException {
		JSONObject json = writeJsonSimpleDemo();
		System.out.println("json: "+json);
		JSONParser parser = new JSONParser();
		Object parsedJSon = parser.parse(json.toString());
		
		JSONObject jsonData = (JSONObject)parsedJSon;
		
		System.out.println("Parsed Value:-");
		String status =  (String)jsonData.get("status");
		String UID =  (String)jsonData.get("UID");
		System.out.println("status: "+status);
		System.out.println("UID: "+UID);
		
		JSONArray arrMess=(JSONArray)jsonData.get("messages");
		
		for(int i=0;i<arrMess.size();i++) {
			String messages = (String)arrMess.get(i);
			System.out.println("Message["+(i+1)+"]:"+ messages);
		}
		
		
	}
	
	public static JSONObject writeJsonSimpleDemo() {
		
		JSONObject json = new JSONObject();
		json.put("status", "success");
		json.put("UID", "1024");
		
		JSONArray messages = new JSONArray();
		
		messages.add("Hey!");
	    messages.add("What's up?!");
	    
	    json.put("messages", messages);	
	    return json;
		
	}
}
