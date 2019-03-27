package leetcode;

import java.util.ArrayList;
import java.util.List;


public class P916 {
    public static List<String> wordSubsets(String[] A, String[] B) {
    	List<String> res = new ArrayList<>();
    	
    	int[] maxChars = new int[26];
    	
    	
    	for(int i = 0; i < B.length; i++) {
    		int[] currentChars = new int[26];
			for(char c : B[i].toCharArray()) {
				currentChars[c-'a']++;
			}
			
			for(int j = 0; j < 26; j++) {
				if(currentChars[j] > maxChars[j]) {
					maxChars[j] = currentChars[j];
				}
			}
    	}
    	    	
    	for(String s : A) {
    		int[] charNum = new int[26];
    		for(char c : s.toCharArray()) {
				charNum[c-'a']++;
    		}
    		
    		boolean flag = true;
			for(int j = 0; j < 26; j++) {
				if(maxChars[j] > charNum[j]) {
					flag=false;
					break;
				}
			}
			if(flag)
				res.add(s);
    	}
    	return res;
    }
    

    




	public static void main(String[] args) {
    	String[] A = {"amazon","apple","facebook","google","leetcode"};
    	String[] B = {"ec","oc","ceo"};
		System.out.println(wordSubsets(A, B));
		System.out.println(9223372036854775807L-Math.pow(101, 9));
	}
}
