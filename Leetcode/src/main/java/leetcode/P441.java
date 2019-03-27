package leetcode;

public class P441 {

    public static int arrangeCoins(int n) {
    	if(n <= 1)
    		return n;
    	
        int a = (int)Math.sqrt((long)2 * n);
        long b = (long)a * (long)(a +1);
        if(b / 2 <=  n)
        	return a;
        return a - 1;
    }
    
    public static void main(String[] args) {
		System.out.println(arrangeCoins(1804289383));
	}
}
