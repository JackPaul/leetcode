package easy;

import java.util.HashSet;
import java.util.Set;

public class P389 {

    public static char findTheDifference(String s, String t) {
        Set<Character> set = new HashSet<>();
        //set.addAll(s.toCharArray());
        char[] charArray = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        for(char c : charArray) {
        	
            String str = new String(charArray2);
        	charArray2[str.indexOf(c+"")] = '*';
        }
        
        for(char c : charArray2) {
        	if(c != '*')
        		return c;
        }
        return 0;
    }
    
    public static void main(String[] args) {
    	findTheDifference("abcd", "abcde");
	}

}
