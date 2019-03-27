package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P290 {

    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] words = str.split(" ");
        if(pattern.length() != words.length)
        	return false;
        for(int i = 0; i < pattern.length(); i++) {
        	set.add(words[i]);
        	if(map.containsKey(pattern.charAt(i))) {
        		if(!words[i].equals(map.get(pattern.charAt(i))))
        			return false;
        	} else {
        		map.put(pattern.charAt(i), words[i]);
        	}
        }
        
        return map.size() == set.size();
    }

}
