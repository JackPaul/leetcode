package leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class P819 {

    public static String mostCommonWord(String paragraph, String[] banned) {
    	paragraph = paragraph.toLowerCase();
    	char[] charArray = paragraph.toCharArray();
    	for(int i = 0; i <= charArray.length-1; i++) {
    		if(!((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z'))) {
    			charArray[i] = ' ';
    		}
    	}
    	
    	paragraph = new String(charArray);
        String[] words = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
        	
        	if(map.containsKey(word))
        		map.put(word, map.get(word) + 1);
        	else
        		map.put(word, 1);
        }
        
        for(String word : banned) {
        	word = word.toLowerCase();
        	map.put(word, 0);
        }
        
        int max = 0;
        String s = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
        	if(entry.getValue() > max) {
        		s = entry.getKey();
        		max = entry.getValue();
        	}
        }
        
        map.put("", 0);
        System.out.println(map);
        return max==0?"":s;
    }
    
    
    public static void main(String[] args) {
    	String a = "Bob. hIt, baLl";
    	String[] b = {"bob", "hit"};
		System.out.println(mostCommonWord(a, b));
	}
}
