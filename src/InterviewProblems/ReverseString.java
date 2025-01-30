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
		
		//change the date format
		String date1 ="09/20/2020";
		String[] arrStr = date1.split("/");
		System.out.println(arrStr[1]+"/"+arrStr[0]+"/"+arrStr[2]);
		
		revString("Helloworld");
	}
	
	public static void revString(String text) {
		char arr[] =  text.toCharArray();
		
		for(int i=text.length()-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}
}
