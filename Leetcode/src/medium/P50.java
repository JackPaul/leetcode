package medium;

public class P50 {
	/*
    public static double myPow(double x, int n) {
        if(n == 0)
        	return 1;
        if(n == 1)
        	return x;
        double res = 1;

        if(n < 0) {
        	int d = n * -1;
            for(int i = 0; i < d; i++) {
            	res /= x;
            }
            return res;
        }
        
        for(int i = 0; i < n; i++) {
        	res *= x;
        }
        return res;     	
    }
    */
	
	public static double myPow(double x, int n) {
        if(n == 0)
        	return 1;
        if(n == 1)
        	return x;
        boolean flag = false;
        if(n < 0) {
        	if(n == Integer.MIN_VALUE) {
        		flag = true;
        		n = -1 * (n + 1);
        	}else {
        		n = -1 * n;
        	}
            
            x = 1 / x;
            
        }
        
        if((n & 1) != 1)
        	return myPow(x * x, n >> 1);
        else {
        	double res = myPow(x * x, (n - 1) >> 1);
        	return flag?x * x * res:x * res;  
        }
        	  	
    }
    
    public static void main(String[] args) {
    	double x = 2.00;
    	int n = -2;
	System.out.println(myPow(x,n
			
			));	
	}
}
