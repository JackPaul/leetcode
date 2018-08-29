package easy;

public class P859 {

    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length() || A.length() < 2 || B.length() < 2)
        	return false;
        else {
        	int count = 0;
        	int[] index = {-1, -1};
        	for(int i = 0; i <= A.length() - 1; i++) {
        		if(A.charAt(i) != B.charAt(i)) {
        			index[count++] = i;
        			if(count == 2) {
        				break;
        			}
        		}
        	}
        	
        	if(count == 2) {
        		
        	} else {
        		return false;
        	}
        	
        }
    }

}
