package leetcode;

public class P172 {

    public static int trailingZeroes(int n) {
    	if(n == 0)
    		return 0;
        
    	int num5 = 0;	
    	int m = n;
    	while(m > 0) {
    		num5++;
    		m /= 5;
    	}
    	num5--;	
    	int n5 = n / 5;    	
    	n5 += num5*(num5+1)/2;
    	return n5;
    }
    
    public static void main(String[] args) {
		System.out.println(trailingZeroes(25));
	}
}
