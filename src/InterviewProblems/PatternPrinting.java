package InterviewProblems;

import javax.xml.stream.events.NotationDeclaration;

// https://www.edureka.co/blog/30-pattern-programs-in-java/
public class PatternPrinting {
	
	public static void main(String args[]) {
		//pattern_01(5);
		//pattern_02(5);
		pattern_03(5);
		
	}
	
	public static void pattern_01(int noOfStar) {	
		for(int i=1;i<=noOfStar;i++) {			
			for(int j=noOfStar - i;j>0;j--) {
				System.out.print(" ");
			}
			for (int m=1;m<=i;m++) {
				System.out.print("* ");
			}
			System.out.println("");
		}		
	}
	public static void pattern_02(int noOfStar) {
		for(int i=0;i<noOfStar;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void pattern_03(int noOfStar) {
		for(int i=1;i<=noOfStar;i++) {
			for(int s=noOfStar-i;s>0;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
