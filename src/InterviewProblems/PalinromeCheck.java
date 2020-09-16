package InterviewProblems;

public class PalinromeCheck {
	
	public static void main(String[] args) {
		String text = "racecar";
		String revString = "";
		
		for (int i = text.length()-1 ; i >-1 ;i--) {
			revString = revString + text.charAt(i);
		}
		System.out.print(revString);
		if (text.equals(revString)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
		
	}
}
