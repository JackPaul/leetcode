package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P500 {

	public String[] findWords(String[] words) {
        //String [] res = new String[words.length];
		List<String> list = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		map.put('a', 1);
		map.put('s', 1);
		map.put('d', 1);
		map.put('f', 1);
		map.put('g', 1);
		map.put('h', 1);
		map.put('j', 1);
		map.put('k', 1);
		map.put('l', 1);
		map.put('q', 2);
		map.put('w', 2);
		map.put('e', 2);
		map.put('r', 2);
		map.put('t', 2);
		map.put('y', 2);
		map.put('u', 2);
		map.put('i', 2);
		map.put('o', 2);
		map.put('p', 2);
		map.put('z', 3);
		map.put('x', 3);
		map.put('c', 3);
		map.put('v', 3);
		map.put('b', 3);
		map.put('n', 3);
		map.put('m', 3);
		
		
		for(String word : words) {
			
			String word1 = word.toLowerCase();
			int i = map.get(word1.charAt(0));
			boolean flag = true;
			for(Character c : word1.toCharArray()) {
				if(map.get(c) != i) {
					flag=false;
					break;
				}
			}
			if(flag) {
				list.add(word);
			}
		}
		
		String[] res = new String[list.size()];
		res = list.toArray(res);
		return res;
    }

}
