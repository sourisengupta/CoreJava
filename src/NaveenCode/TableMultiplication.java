package NaveenCode;

import java.util.Scanner;

public class TableMultiplication {
	public static void main(String args[]) {
		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a number: ");
		
		int num = reader.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num +" x "+i+"  = "+ (num*i));
		}
		
	}
}
