package InterviewProblems;
import java.util.Arrays;

//Java program to input full name of a person and print only the initials. 


public class PrintingInitialsName {
	
	public static void main(String []args){
		
		String fName = "Souri Sengupta";
		String mName = "NA";
		String lName = "Sengupta";
	
        String initials = printInititals(fName);
        System.out.println("The initials= "+initials);
     }
	public static String printInititals(String name) {
		String names[] = name.split(" ");
		String a = "";
		for(String n: names) {
			a = a + String.valueOf(n.charAt(0));
		}
		// Need to code
		return a;
	}
     
     
}
