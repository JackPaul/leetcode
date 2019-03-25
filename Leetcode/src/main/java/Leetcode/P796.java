package easy;

public class P796 {

    public boolean rotateString(String A, String B) {
        boolean res = false;
        if(A.equals(B))
        	return true;
        for(int i = 0; i < A.length(); i++) {
        	A = A.substring(1, A.length()) + A.charAt(0);
        	if(A.equals(B)) {
        		res = true;
        	}
        }
    	return res;
    }

}
