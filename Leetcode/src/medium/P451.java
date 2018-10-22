package medium;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class P451 {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	if(map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        	} else {
        		map.put(s.charAt(i), 1);
        	}
        }
        
        Set<Integer> set = new HashSet<>();
        //Collection<Integer> values = map.values();
        List<Integer> values = new ArrayList<>();
    	for(Map.Entry<Character, Integer> e : map.entrySet()) {
    		values.add(e.getValue());
    	}
        Collections.sort(values);
        set.addAll(values);
        values.clear();
        values.addAll(set);
        for(int i = values.size() - 1; i >= 0; i--) {
        	for(Map.Entry<Character, Integer> e : map.entrySet()) {
        		if(e.getValue() == values.get(i)) {
        			for(int j = 0; j < e.getValue(); j++) {
        				sb.append(e.getKey());
        			}
        			map.put(e.getKey(), 0);
        		}
        	}
        }
        return sb.toString();
    }
}
