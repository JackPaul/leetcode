package leetcode;

public class P204 {

    public int countPrimes(int n) {
    	int count = 1;
    	if(n <= 2)
    		return 0;
        for(int i = 3; i < n; i += 2) {
        	if(isPrime(i))
        		count++;
        }
        return count;
    }
    
     public static boolean isPrime(int n) {
    	if(n == 1)
    		return false;
    		
    	for(int i = 2; i <= (int)Math.sqrt(n); i++) {
    		if(n % i == 0)
    			return false;
    	}
    	
    	return true;
    }


}
