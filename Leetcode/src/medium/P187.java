package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P187 {

    public static List<String> findRepeatedDnaSequences(String s) {
    	List<String> res = new ArrayList<String>();
    	if(s.length() < 11)
    		return res;
    	Map<String, Integer> map = new HashMap<>();
    	String s1 = null;
    	for(int i = 0; i < s.length()-9; i++) {
    		s1 = s.substring(i, i+10);
    		if(map.containsKey(s1)) {
    			if(map.get(s1) == 1) {
        			res.add(s1);
        			map.put(s1, 2);
    			}
    			
    		} else {
    			map.put(s1, 1);
    		}
    	}
    	return res;
    }
    /*
    sliding window to get each 10-letter-long sequences and use as key in hashmap.
    count > 1 add to result lit.
    Time O(n). 
    Space O(m) -- m unique sequences
    ====
    but there are only 4 letter choices, I think we can optimize the space.

    10 letter long string 2 bytes * 10 = 20 bytes.
    if we can uniquely ID each letter, 
        saying using 2 bits (0, 1, 2, 3) * 10 = 20 bits -- we can use 1 Integer (4 bytes) as key.
    Solution 1: map letter to ID. 
        'A' -> 00
        'C' -> 01
        'G' -> 10
        'T' -> 11
    use an Integer to keep 

    Solution 2: use the last 3 digits of each letter to represent it. 
    still use an int to keep the 10-letter-long sequence.
    
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            if (s == null || s.length() < 10) {
                return new ArrayList<>();
            }
            int[] map = new int[26];
            // map['A' - 'A'] = 0;
            map['C' - 'A'] = 1;
            map['G' - 'A'] = 2;
            map['T' - 'A'] = 3;
            
            List<String> res = new ArrayList<>();
            Set<Integer> dna = new HashSet<>();
            Set<Integer> dups = new HashSet<>();
            
            int key = 0;
            for (int i = 0; i < s.length(); i++) {
                int val = map[s.charAt(i) - 'A'];
                // 1. key shift left 2 bits to make space for new char id
                key <<= 2;
                // 2. key 32 bits. only use last 20 bits. set first 12 bits to 0
                // 0000 0000 0000 1111 1111 1111 1111 1111
                key &= 0x000fffff;
                // 3. key | new val to add new val
                key |= val;
                
                if (i >= 9) {
                    if (!dna.add(key)) {
                        if (dups.add(key)) {
                            res.add(s.substring(i - 9, i + 1));
                        }
                    }
                }
            }
            return res;
        }
    }
    */
    public static void main(String[] args) {
		System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAAA"));
	}

}
