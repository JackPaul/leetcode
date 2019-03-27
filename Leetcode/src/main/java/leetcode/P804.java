package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class P804 {
	
	public static int uniqueMorseRepresentations(String[] words) {
		String tags[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i <= 25; i++) {
        	map.put((char)('a'+i), tags[i]);
        }
        
        Set<String> set = new HashSet<>();
        String s = "";
        for(String word : words) {
        	for(int i = 0; i < word.length(); i++) {
        		s += map.get(word.charAt(i));
        	}
        	set.add(s);
        	s = "";
        }
		return set.size();
    }
	
	public static void main(String[] args) {
		String[] a = {"gin", "zen", "gig", "msg"};
	
		System.out.println(uniqueMorseRepresentations(a));
	}
}
