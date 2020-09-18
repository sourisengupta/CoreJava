package InterviewProblems;

public class PlayWithStrings {
	public static void main(String args[]) {
		String text="abcd";
		
		char lastChar = text.charAt(text.length()-1);
		String restChar = text.split(Character.toString(lastChar))[0];
		String newText = lastChar + restChar;
		System.out.println(newText);
	}

}
