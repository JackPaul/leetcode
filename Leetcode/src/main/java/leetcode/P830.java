package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P830 {

    public static List<List<Integer>> largeGroupPositions(String S) {
    	List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = null;
    	int start = 0;
    	int end = 0;
    	char flag = S.charAt(0);
    	while(end < S.length()) {	
    		if(S.charAt(end) != flag) {
    			if(end - start >= 3) {
    				list = new ArrayList<>();
    				list.add(start);list.add(end-1);
    				res.add(list);
    			} 
    			flag = S.charAt(end);
    			start = end;
    		} 
    		end++;	
    	}
    	
    	if(end - start >= 3) {
			list = new ArrayList<>();
			list.add(start);list.add(end-1);
			res.add(list);
		} 
    	return res;
    }
    
    public static void main(String[] args) {
		largeGroupPositions("abbxxxxzzy");
	}
    
}
