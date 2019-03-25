package medium;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals(""))
        	return 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 1;
        int low = 0;
        int high = 1;
        int p = 0;
        map.put(s.charAt(0), 0);
        while(high < s.length()) {
        	char c = s.charAt(high);
        	
        	if(map.containsKey(c)) {
        		res = (high - low)>res?(high-low):res;
        		p = map.get(c);
        		for(int i = low; i <= p; i++) {
        			map.remove(s.charAt(i));
        		}
        		low = p + 1;
        	} 
        	
        	map.put(c, high);
        	high++;
        	
        }
        res = (high - low)>res?(high-low):res;
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(" "));
	}
}
