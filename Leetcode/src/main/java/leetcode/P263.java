package leetcode;

public class P263 {

    public boolean isUgly(int num) {
    	if(num == 0)
    		return false;
    	
    	while(num % 2 == 0) {
    		num = num / 2;
    	}
    	
    	while(num % 3 == 0) {
    		num = num / 3;
    	}
    	
    	while(num % 5 == 0) {
    		num = num / 5;
    	}
    	
    	if(num != 1)
    		return false;
    	else
    		return true;
    }
    
    public static boolean isPrime(int n) {
    	if(n == 1)
    		return false;
    		
    	for(int i = 2; i < n; i++) {
    		if(n % i == 0)
    			return false;
    	}
    	
    	return true;
    }

    public static void main(String[] args) {
		System.out.println(isPrime(7));
	}
}
