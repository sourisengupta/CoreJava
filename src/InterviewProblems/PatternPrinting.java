package InterviewProblems;

import javax.xml.stream.events.NotationDeclaration;

// https://www.edureka.co/blog/30-pattern-programs-in-java/
public class PatternPrinting {
	
	public static void main(String args[]) {
		//pattern_01(5);
		//pattern_02(5);
		//pattern_03(5);
		pattern_04(5);
		
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
	public static void pattern_04(int noOfRow) {	
		for(int row=1;row<= noOfRow;row++) {
			int space = noOfRow > row ? noOfRow - row : row - noOfRow;
			//int totalCol = noOfRow > row ? 2* row - 1 : ;
			for(int s=1;s<=space;s++) {
				System.out.print(" ");
			}
			for(int i=1;i<= 2 * row - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//need a work
		for(int row=1;row> noOfRow - 1; row++) {
			for (int j=2 * noOfRow - 1 ;j> row;j--) {
				System.out.print(" ");
			}
			for(int col=1;col>noOfRow -1;col++) {
				System.out.print("*");
			}
		}
		System.out.println("");
	}
}
