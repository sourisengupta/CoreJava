package InterviewProblems;


/*Q1. Maximum Frequency Number
Ninja is given an array of integers that contain numbers in random order. He needs to write a program to find and return the number which occurs the maximum times in the given input. He needs your help to solve this problem.
If two or more elements contend for the maximum frequency, return the element which occurs in the array first i.e. whose index is lowest.*/
public class MaxOccuranceInArray {
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,1,2,3,1,7,1};
		int cnt=0;
		int maxOccNo=0;
		
		for (int i=0;i<arr.length;i++) {
			int cnt1=0;
			for(int y =0;y<arr.length;y++) {
				if(arr[i]==arr[y]) {
					cnt1++;
				}				
			}
			
			if(cnt1>cnt) {
				cnt = cnt1;
				maxOccNo = arr[i];
			}
		}
		System.out.println("Max:"+cnt+" No: "+maxOccNo);
		
	}
}
