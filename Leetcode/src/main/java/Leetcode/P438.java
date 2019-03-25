package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P438 {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
    	if(s.length() < p.length())
    		return res;
        Map<Character, Integer> map = initMap();
        countChars(p, map);
        Map<Character, Integer> dynamicMap = initMap();
        countChars(s.substring(0, p.length()), dynamicMap);
        if(map.equals(dynamicMap))
        	res.add(0);
        for(int i = p.length()+1; i <= s.length(); i++) {
        	dynamicMap.put(s.charAt(i-p.length()-1), dynamicMap.get(s.charAt(i-p.length()-1))-1);
        	dynamicMap.put(s.charAt(i-1), dynamicMap.get(s.charAt(i-1))+1);
        	if(map.equals(dynamicMap))
        		res.add(i-p.length());
        }
        return res;
    }
    
    public void countChars(String s, Map<Character, Integer> map){
    	for(char c : s.toCharArray()) {
    			map.put(c, map.get(c) + 1);
    	}

    }
    
    public Map<Character, Integer> initMap() {
    	Map<Character, Integer> res = new HashMap<>();
    	for(char c = 'a'; c <= 'z'; c++) {
    		res.put(c, 0);
    	}
    	return res;
    }
}
