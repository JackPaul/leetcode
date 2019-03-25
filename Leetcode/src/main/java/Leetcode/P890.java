package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P890 {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
    	for(String s : words) {
        	if(match(s, pattern)) {
        		res.add(s);
        	}
        }
    	
    	return res;
    }

	private static boolean match(String s, String pattern) {
		if(s.length() != pattern.length())
			return false;
		Map<Character, Character> map1 = new HashMap<>();
		Map<Character, Character> map2 = new HashMap<>();
		for(int i = 0; i <s.length(); i++) {
			if(map1.containsKey(s.charAt(i))) {
				if(map1.get(s.charAt(i)) != pattern.charAt(i))
					return false;
			} else {
				if(map2.containsKey(pattern.charAt(i)) && map2.get(pattern.charAt(i)) != s.charAt(i))
					return false;
				map1.put(s.charAt(i), pattern.charAt(i));
				map2.put(pattern.charAt(i), s.charAt(i));
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
		String pattern = "abb";
		System.out.println(findAndReplacePattern(words, pattern));
	}

}
