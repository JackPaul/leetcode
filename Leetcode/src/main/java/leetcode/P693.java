package leetcode;

public class P693 {

	public static boolean hasAlternatingBits(int n) {
		if(n == 1)
			return true;
        boolean res = false;
        int i = n & 1;
        n = n >> 1;
        int j = 0;
        while(n > 0) {
        	j = n & 1;
        	if(j != i) {
        		res = true;
        	} else {
        		res = false;
        		break;
        	}
        	n = n >> 1;
        	i = j;
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(7));
	}
}
