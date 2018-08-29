package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> map = countChars(p);
        for(int i = 0; i < s.length() - p.length(); i++) {
        	if(map.equals(countChars(s.substring(i, i+p.length()))))
        		res.add(i);
        }
        return res;
    }
    
    public Map<Character, Integer> countChars(String s){
    	Map<Character, Integer> res = new HashMap<Character, Integer>();
    	for(char c : s.toCharArray()) {
    		if(res.containsKey(c)) {
    			res.put(c, res.get(c) + 1);
    		} else {
    			res.put(c, 1);
    		}
    	}
    	return res;
    }
    
    public equalMap
}
