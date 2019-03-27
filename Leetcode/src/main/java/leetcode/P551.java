package leetcode;

public class P551 {

    public static boolean checkRecord(String s) {
        int countA = 0;
        int beginL = 0;
        boolean flag = false;
        
        int i = 0;
        for(i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'A') {
        		countA++;
        		if(countA > 1)
        			return false;
        	}
        	
        	if(s.charAt(i) == 'L'){
        		if(!flag) {
        			flag = true;
        			beginL = i;
        		} else {
        			if(i - beginL > 2)
        				return false;
        		}
        	} else {
        		if(flag) {
        			if(i - beginL > 2)
        				return false;
        			else
        				flag = false;
        		}
        	}
        }
        
        if(flag)
        	return i - beginL <= 2;
        else
        	return true;
    }
    
    public static void main(String[] args) {
		System.out.println(checkRecord("ALL"));
	}
}
