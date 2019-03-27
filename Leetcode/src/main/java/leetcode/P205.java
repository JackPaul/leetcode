package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P205 {
    public static boolean isIsomorphic(String s, String t) {
    	if(s.length() != t.length())
    		return false;
    	
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) != s.charAt(i))
        		return false;
        	else
        		map.put(t.charAt(i), s.charAt(i));
        }
        
        map.clear();
        for(int i = 0; i < s.length(); i++) {
        	if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i))
        		return false;
        	else
        		map.put(s.charAt(i), t.charAt(i));
        }   
        return true;
    }
    
    public static void main(String[] args) {
		System.out.println(isIsomorphic("aa", "ab"));
	}
}
