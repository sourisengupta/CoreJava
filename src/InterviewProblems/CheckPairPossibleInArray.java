package InterviewProblems;

// Given an array of integer validate if the pair can be possible for summation of the pair is odd number and even number

public class CheckPairPossibleInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-11,2,3,4,5,6};
		
		boolean possible = checkPairPossibleForOddSum(arr);
		if(possible) {
			System.out.println("Pairs are possible for summation of Odd number");
		}
		else{
			System.out.println("Pairs are not possible for summation of Odd number");
		}
		possible = checkPairPossibleForEvenSum(arr);
		if(possible) {
			System.out.println("Pairs are possible for summation of Even number");
		}  
		else{
			System.out.println("Pairs are not possible for summation of Even number");
		}
				
	}
	public static boolean checkPairPossibleForOddSum(int[] arr) {
		int cntEven=0;
		int cntOdd=0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				cntEven++;
			}
			else {
				cntOdd++;
			}
		}
		
		if(cntEven!=cntOdd) {
			return false;
		}
		return true;	

	}
	public static boolean checkPairPossibleForEvenSum(int[] arr) {
		int cntEven=0;
		int cntOdd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				cntEven++;
			}
			else {
				cntOdd++;
			}
		}
		System.out.println("Odd:"+cntOdd);
		if(cntOdd%2 != 0) {
			return false;
		}
		return true;	

	}
}
