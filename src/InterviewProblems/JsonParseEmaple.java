package InterviewProblems;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParseEmaple {
	
	public static void main(String args[]) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("example_2.json");
		Object quizObj = parser.parse(reader);
		JSONObject jsonContent = (JSONObject)quizObj;
		
		//First retrieve the root element
		JSONObject quiz = (JSONObject)jsonContent.get("quiz");
//		System.out.println(quiz);
		
		
		//Retrive Sport section from json
		JSONObject sport = (JSONObject)quiz.get("sport");		
		JSONObject q1 = (JSONObject)sport.get("q1");
		String question = (String)q1.get("question");
		System.out.println("question: "+question);		
		JSONArray options = (JSONArray)q1.get("options");		
		for (int i=0;i<options.size();i++) {
			String strOption = (String)options.get(i);
			System.out.println("SportOption["+i+"]:"+strOption);
		}
		String answer = (String)q1.get("answer");
		System.out.println("answer:"+answer);
		
		
		//Retrive maths section from json
		JSONObject maths = (JSONObject)quiz.get("maths");
//		System.out.println(maths);
		JSONObject mathsQ1 = (JSONObject)maths.get("q1");
		JSONObject mathsQ2 = (JSONObject)maths.get("q2");
		
		String mathQ1Question= (String) mathsQ1.get("question");
//		System.out.println("mathQ1Question: "+mathQ1Question);
		JSONArray mathQ1Options = (JSONArray)mathsQ1.get("options");
		for (int i=0;i<mathQ1Options.size();i++) {
			String opt = (String)mathQ1Options.get(i);
//			System.out.println("Mathptions["+i+"]:"+opt);
		}
		String mathQ1Answer  = (String) mathsQ1.get("answer");
//		System.out.println("mathQ1Answer: "+mathQ1Answer);
		
		
		
		Iterator iterator = maths.keySet().iterator();
		//Loop through JSONObject
		while (iterator.hasNext()) {
			
			String key = (String) iterator.next();
			System.out.println(key);
			
			JSONObject mathsQ = (JSONObject)maths.get(key);
			
			String questionMaths = (String)mathsQ.get("question");
			String answerMaths =  (String)mathsQ.get("answer");
			JSONArray arrMathsOptions = (JSONArray) mathsQ.get("options");
			System.out.println("question: "+questionMaths);
			for (int i=0;i<arrMathsOptions.size();i++) {
				System.out.println("options: "+arrMathsOptions.get(i));
			}
			System.out.println("Answer: "+answerMaths);	
			
		}
		
		
	}
}
