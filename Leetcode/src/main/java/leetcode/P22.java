package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P22 {
    public static List<String> generateParenthesis(int n) {
    	List<String> currentList = new ArrayList<>();
        List<String> res = new ArrayList<>();
        res.add("()");
        
        if(n == 0)
        	return currentList;
        
        if(n == 1) {
        	return res;
        }
        
        for(int i = 1; i < n; i++) {
        	for(String s : res) {
        		for(int j = 1; j <= s.length(); j++) {
        			String s1 = s.substring(0,j)+"()"+s.substring(j);
        			if(!duplicated(currentList, s1))
        				currentList.add(s1);
        		}
        	}
        	res.clear();
        	copy(res, currentList);
        	currentList.clear();
        }
        return res;
    }
    
    private static void copy(List<String> res, List<String> currentList) {
		for(int i = 0; i < currentList.size(); i++) {
			res.add(currentList.get(i));
		}
		
	}

	private static boolean duplicated(List<String> res, String s1) {
		for(String s : res) {
			if(s.equals(s1))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		//System.out.println(new StringBuffer("add").reverse().toString());
    	System.out.println(generateParenthesis(3));
	}
}
