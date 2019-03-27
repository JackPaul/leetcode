package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class P139 {
	
	/*
	//超时
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
    */
    public static boolean wordBreak(String s, List<String> wordDict) {
		if(s.equals(""))
			return true;
		int[] chars = new int[26];
    	Map<Character,  List<String>> map = new HashMap<>();
    	for(String word : wordDict) {
    		Character c = word.charAt(0);
    		if(map.containsKey(c)) {
    			map.get(c).add(word);
    		} else {
    			List<String> list = new ArrayList<>();
    			list.add(word);
    			map.put(c, list);
    		}
    		for(int i = 0; i < word.length(); i++) {
    			chars[word.charAt(i) - 'a']++;
    		}
    	}
    	
		for(int i = 0; i < s.length(); i++) {
			if(chars[s.charAt(i) - 'a'] == 0)
				return false;
		}
    	return wordBreak(s, map);
        
    }
    
    private static boolean wordBreak(String s, Map<Character, List<String>> map) {
		if(s.equals(""))
			return true;
		Character c = s.charAt(0);
		if (!map.containsKey(c))
			return false;
		List<String> list = map.get(c);
		boolean f = false;
		for(String w : list) {
			if(s.indexOf(w) == 0) {
				f = f || wordBreak(s.substring(w.length()), map);
			}
		}
		return f;
	}
    
   
	public static void main(String[] args) {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		
		List<String> wordDict = new ArrayList<>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
		System.out.println(wordBreak(s, wordDict));
	}
}
