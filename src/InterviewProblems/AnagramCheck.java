package InterviewProblems;
import java.util.Arrays;

//An anagram is a word or phrase formed by rearranging the letters 
//of a different word or phrase, typically using all the original letters exactly once.

public class AnagramCheck {
	
	public static void main(String []args){
        boolean flag = analogWord1("race","care");
        if(flag){
            System.out.println("The words are analog ");
        }
        else{
            System.out.println("The words are not analog");
        }
        
     }
	public static boolean analogWord1(String str1, String str2) {
		
		char c_str1[] = str1.toCharArray();
		char c_str2[] = str2.toCharArray();
		
		Arrays.sort(c_str1);
		Arrays.sort(c_str2);
		
		return Arrays.equals(c_str1, c_str2);
	}
     
     public static boolean analogWord(String word1, String word2){
         
         String str1 = word1.toLowerCase().replaceAll(" ", "");
         String str2 = word2.toLowerCase().replaceAll(" ", "");
         
         
         if(str1.length()!=str2.length()){
             return false;
         }
         else {
             char[] s1 = str1.toCharArray();
             char[] s2 = str2.toCharArray();
             
             Arrays.sort(s1);
             Arrays.sort(s2);
             System.out.println(s1);
             System.out.println(s2); 
             if(!Arrays.equals(s1,s2)) {
            	 return false;
             }
         }
         return true;
         
     }
}
