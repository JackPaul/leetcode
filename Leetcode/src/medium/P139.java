package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P139 {
    public static boolean wordBreak(String s, List<String> wordDict) {

        if(s.length() == 0)
        	return true;
        boolean res = false;
        String s1 = "";
        for(int i = 0; i < wordDict.size(); i++) {
        	s1 = wordDict.get(i);
        	if(s1.charAt(0) == s.charAt(0) && s.length() >= s1.length() && s1.equals(s.substring(0, s1.length()))) {
        		if(wordBreak(s.substring(s1.length()), wordDict)) {
        			return true;
        		}
        	} 
        }
        return res;
    }
    
    public static void main(String[] args) {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		List<String> wordDict = new ArrayList<>(Arrays.asList("le","leet","code","co"));
		System.out.println(wordBreak("leetcodeleet", wordDict));
	}
}
