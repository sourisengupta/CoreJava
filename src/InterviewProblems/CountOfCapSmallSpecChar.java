package InterviewProblems;

public class CountOfCapSmallSpecChar {
	
	
	public static void main(String args[]) {
		String word="qasdASas?das";
		int upCnt=0;
		int lowCnt=0;
		int numCnt=0;
		int specCnt=0;
	
		for (int i=0;i<word.length();i++) {
			if(word.charAt(i)>=65 && word.charAt(i)<=90) {
				upCnt++;
			}
			else if (word.charAt(i)>=97 && word.charAt(i)<=122) {
				lowCnt++;
			}
			else if (word.charAt(i)>=48 && word.charAt(i)<=57) {
				numCnt++;
			}
			else {
				specCnt++;
			}
			
		}
		System.out.println(upCnt);
		System.out.println(lowCnt);
		System.out.println(numCnt);
		System.out.println(specCnt);
		
	}
}
