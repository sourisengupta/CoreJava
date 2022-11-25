package NaveenCode;

import java.util.Scanner;

public class FibonacciSeriesOfANumber {
	public static void main(String args[]) {
		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		
		int firstNum = 1;
		int secNum = 2;
		if(num ==1 ) {
			System.out.println("Fibonacci Series: "+firstNum);
		}
		else if (num ==2) {
			System.out.println("Fibonacci Series: "+firstNum+","+secNum);
		}
		else {
			
			for (int i=1+2;i<=num;i++) {
				int sum = firstNum + secNum;
				firstNum = secNum;
				secNum = sum;
				System.out.println("");
			}
		}
			
		
		
	}
}
