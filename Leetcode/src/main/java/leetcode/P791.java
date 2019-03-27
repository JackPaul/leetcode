package leetcode;

public class P791 {
    public String customSortString(String S, String T) {
        StringBuffer sb = new StringBuffer();
        boolean[] f = new boolean[T.length()];
        for(int i = 0; i < S.length(); i++) {
        	for(int j = 0; j < T.length(); j++) {
        		if(T.charAt(j) == S.charAt(i)) {
        			f[j] = true;
        			sb.append(T.charAt(j));
        		}
        	}
        }
        
        for(int j = 0; j < T.length(); j++) {
        	if(!f[j]) {
        		sb.append(T.charAt(j));
        	}
        }
        
        return sb.toString();
    }
}
