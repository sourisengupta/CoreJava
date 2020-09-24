package InterviewProblems;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonInJava {
	public static void main(String args[]) throws IOException, ParseException {
		
		//Read the Json file and store it in JSONObject
		JSONObject jsonWidget = new JSONObject();
		//Read the File
		FileReader reader = new FileReader(".\\sample.json");
		//Declare a Json Parser
		JSONParser parser = new JSONParser();
		
		//Parse the reader and store in a java object
		Object obj = parser.parse(reader);
		
		//Typecast java obj to Json obj
		jsonWidget=(JSONObject)obj;
		
		JSONObject objWidget = (JSONObject)jsonWidget.get("widget");
		JSONObject objImage  = (JSONObject)objWidget.get("image");
		String alignment = (String)objImage.get("alignment");
		
		
		System.out.println(alignment);
		
		
		
	}
}
