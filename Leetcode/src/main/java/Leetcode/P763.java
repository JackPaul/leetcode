package medium;

import java.util.ArrayList;
import java.util.List;

public class P763 {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        
        int beginIndex = 0;
        int endIndex = 0;
        int tail = S.length() - 1;
        int i = 0;
        i = beginIndex;
        while(i < S.length()) {
        	while(tail > endIndex && S.charAt(tail) != S.charAt(i)) {
        		tail--;
        	}
        	
        	if(tail == i) {
        		if(i == endIndex) {
            		res.add(tail - beginIndex + 1);
            		beginIndex = tail + 1;
            		i = beginIndex;
            		endIndex = i;
        		}
        		
        	}else {
        		endIndex = tail;
        		i++;
        	}
        	
        	tail = S.length() - 1;
        }
        return res;
    }
    
    public static void main(String[] args)
    {
    	String S = "aaa";
		System.out.println(partitionLabels(S));
	}
}
