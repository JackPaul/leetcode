package leetcode;

public class P29 {
    public static int divide(int dividend, int divisor) {
    	int res = 0;
    	boolean flag = false;
    	if(dividend == 0)
    		return 0;
    	
        if(dividend == Integer.MIN_VALUE) {
        	if(divisor == Integer.MIN_VALUE)
        		return 1;
        	if(divisor == -1)
        		return Integer.MAX_VALUE;
            if(divisor == 1)
            	return dividend;
            
    		if(divisor > 1) {
    			flag = true;
    			res++;
    			dividend += divisor;
            	dividend = 0 - dividend;
    		}
    		
    		if(divisor < -1) {
    			res++;
    			dividend -= divisor;
            	dividend = 0 - dividend;
            	divisor = 0 - divisor;
    		}
        } else {
        	if(divisor == Integer.MIN_VALUE)
        		return 0;
            if(divisor == 1)
            	return dividend;
            if(divisor == -1)
            	return 0 - dividend;
            if(dividend > 0 && divisor > 0) {
            	;
            } else if(dividend < 0 && divisor < 0) {
            	flag = false;
            	dividend = 0 - dividend;
            	divisor = 0 - divisor;
            } else if(dividend > 0 && divisor < 0) {
            	flag = true;
            	divisor = 0 - divisor;
            } else {
            	flag = true;
            	dividend = 0 - dividend;
            }
        } 
        while(dividend >= divisor) {
        	res++;
        	dividend -= divisor;
        }
        return flag?0-res:res;
    }
    
    public static void main(String[] args) {
		System.out.println(divide(-2147483648
				,-3));
	}
}
