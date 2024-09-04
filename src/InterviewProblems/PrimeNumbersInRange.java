package InterviewProblems;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.google.protobuf.BoolValueOrBuilder;

public class PrimeNumbersInRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		
		for(int i=2;i<=number;i++) {
			boolean isPrime = checkPrime(i);
			if(isPrime) {
				System.out.println("Prime: "+ i);
			}
		}
	}
	public static boolean checkPrime(int num) {
		for(int i=2;i<=num;i++) {
			System.out.println("The number= "+i);
			if(num%i == 0) {
				return false;			
			}
			
		}
		return true;
		
	}
	
}
