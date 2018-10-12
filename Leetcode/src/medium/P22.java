package medium;

import java.util.ArrayList;
import java.util.List;

public class P22 {
    public List<String> generateParenthesis(int n) {
    	List<String> currentList = new ArrayList<>();
        List<String> res = new ArrayList<>();
        currentList.add("()");
        
        if(n == 0)
        	return res;
        
        if(n == 1) {
        	return currentList;
        }
        
        for(int i = 1; i < n; i++) {
        	for(String s : currentList) {
        		
        	}
        }
        return res;
    }
}
