package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class P49 {
    public  static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new ArrayList<>();
    	List<String> list = new ArrayList<>();
    	list.add(strs[0]);
    	res.add(list);
    	
    	for(int i = 1; i < strs.length; i++) {
    		int g = findGroup(res, strs[i]);
    		//System.out.println(g);
    		if(g != -1) {
    			List<String> l = res.get(g);
    			l.add(strs[i]);
    		} else {
    	    	List<String> l1 = new ArrayList<>();
    	    	l1.add(strs[i]);
    	    	res.add(l1);
    		}
    	} 	
    	return res;
    }
    
    private static int findGroup(List<List<String>> res, String t) {
		for(int i = 0; i < res.size(); i++) {
			List<String> list = res.get(i);
			String s = list.get(0);
			//System.out.println(s+"---"+t);
			if(match(s, t))
				return i;
		}
		
		return -1;
	}

	private static boolean match(String s, String t) {
		if(s.length() != t.length())
			return false;
		int[] c1 = new int[26];
		int[] c2 = new int[26];
		for(int i = 0; i < s.length(); i++)
			c1[s.charAt(i)-'a']++;
		for(int i = 0; i < t.length(); i++)
			c2[t.charAt(i)-'a']++;
		for(int i = 0; i < 26; i++) {
			if(c1[i] != c2[i])
				return false;
		}	
		return true;
	}

	public static void main(String[] args) {
    	String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}
}
