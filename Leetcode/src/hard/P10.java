package hard;

public class P10 {
    public boolean isMatch(String s, String p) {
        
    	int  i = s.length();
    	int j = p.length();
    	char[] ss = s.toCharArray();
    	char[] pp = p.toCharArray();
    	while(i > 0 && j > 0) {
    		if(ss[i] == pp[i] || pp[i] == '.') {
    			i--;
    			j--;
    		} else {
    			if(pp[i] != '*') {
    				return false;
    			} else {
    				
    			}
    		}
    	}
    	
    	return true;
    }
}
