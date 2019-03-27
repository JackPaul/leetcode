package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class P17 {
	
    public List<String> letterCombinations(String digits) {
        Map<Character, String[]> map = new HashMap<>();
        String[] c2 = {"a", "b", "c"};
        String[] c3 = {"d", "e", "f"};
        String[] c4 = {"g", "h", "i"};
        String[] c5 = {"j", "k", "l"};
        String[] c6 = {"m", "n", "o"};
        String[] c7 = {"p", "q", "r", "s"};
        String[] c8 = {"t", "u", "v"};
        String[] c9 = {"w", "x", "y", "z"};
        
        map.put('2', c2);
        map.put('3', c3);
        map.put('4', c4);
        map.put('5', c5);
        map.put('6', c6);
        map.put('7', c7);
        map.put('8', c8);
        map.put('9', c9);
        if(digits == null || digits.equals("")){
        	return new ArrayList<String>();
        }
        List<String> currentList = new ArrayList<>(Arrays.asList(map.get(digits.charAt(0))));
        Set<String> set = new HashSet<>();
        
        for(int i = 1; i < digits.length(); i++) {
        	char digit = digits.charAt(i);
        	String[] strings = map.get(digit);
        	for(String s : currentList) {
        		for(String tail : strings) {
        			set.add(s+tail);
        		}
        	}
        	currentList.clear();
        	currentList.addAll(set);
        	set.clear();
        }
        
        return currentList;
    }
}
