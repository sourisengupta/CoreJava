package NaveenCode;

import java.util.Scanner;

public class CheckNumberEvenOdd {
public static void main(String args[]) {
		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		
		int div = num%2;
		
		if(div == 0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
	}
}
