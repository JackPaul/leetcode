package easy;

import java.util.HashMap;
import java.util.Map;

public class P884 {

	public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();
        
        for(String word : A.split(" ")) {
        	if(mapA.containsKey(word)) {
        		mapA.put(word, mapA.get(word) + 1);
        	} else {
        		mapA.put(word, 1);
        	}
        }
        
        for(String word : B.split(" ")) {
        	if(mapB.containsKey(word)) {
        		mapB.put(word, mapB.get(word) + 1);
        	} else {
        		mapB.put(word, 1);
        	}
        }
        
        String res = "";
        for(String key : mapA.keySet()) {
        	if(mapA.get(key) == 1 && !mapB.containsKey(key)) {
        		res += key+" ";
        	}
        }
        
        for(String key : mapB.keySet()) {
        	if(mapB.get(key) == 1 && !mapA.containsKey(key)) {
        		res += key+" ";
        	}
        }
        
        return res.substring(0, res.length()-1).split(" ");
    }

}
