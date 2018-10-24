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
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
        	if(map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        	} else {
        		map.put(s.charAt(i), 1);
        	}
        }
        
        
        @SuppressWarnings("unchecked")
		List<Character> [] list = new ArrayList[s.length()+1];
        //list.set(s.length(), null);
        for(char key : map.keySet()) {
        	int n = map.get(key);
        	if(list[n] == null) {
        		List<Character> l = new ArrayList<>();
        		l.add(key);
        		list[n]= l;
        	} else {
        		list[n].add(key);
        	}
        }
        
        for(int i = s.length(); i >= 0; i--) {
        	if(list[i] != null) {
        		for(char c : list[i]) {
        			int j = 0;
        			while(j < i) {
        				sb.append(c);
        				j++;
        			}
        		}
        	}
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	String s = "tree";
    	System.out.println(frequencySort(s));
	}
}
