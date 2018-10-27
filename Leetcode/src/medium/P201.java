package medium;

public class P201 {
    public static int rangeBitwiseAnd(int m, int n) {
    	if(m <= 0 && n >= 0)
    		return 0;
    	if(m == n)
    		return m;
    	if(m == 1)
    		return 0;
    	int a = 1;
    	while(m / a > 1) {
    		a <<= 1;
    	}
    	//System.out.println(a);
    	if(m <= a)
    		return a;
    	
        return a & rangeBitwiseAnd(m-a, n-a);
    }
    
    public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(5, 7));
	}
}
