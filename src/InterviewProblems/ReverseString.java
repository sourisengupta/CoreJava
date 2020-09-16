package InterviewProblems;

import java.security.Principal;

public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Souri";
		
		for(int i=0 ; i< name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		
		for(int i =name.length()-1;i>-1; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
