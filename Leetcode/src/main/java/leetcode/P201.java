package leetcode;

public class P201 {
    public static int rangeBitwiseAnd(int m, int n) {
    	if(m == 0 && n == 0)
    		return 0;
    	if(m == n)
    		return m;
        return 2 * rangeBitwiseAnd(m >> 1, n >> 1);
    }
    
    public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(2, 3));
	}
}
