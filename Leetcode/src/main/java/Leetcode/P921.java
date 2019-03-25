package medium;

public class P921 {
    public static int minAddToMakeValid(String S) {
        int res = 0;
        int l = 0, r = 0;
        for(int i = 0; i < S.length(); i++) {
        	if(S.charAt(i) == '(')
        		l++;
        	else
        		r++;
        	if(r > l) {
        		l++;
        		res++;
        	}
        }
        res += l  - r;
        return res;
    }
    
    public static void main(String[] args) {
		System.out.println(minAddToMakeValid("()))(("));
	}
}
