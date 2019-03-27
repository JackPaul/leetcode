package leetcode;

public class P762 {

	public static int countPrimeSetBits(int L, int R) {
        int count = 0;
        int total = 0;
        for(int i = L; i <= R; i++)
        {
        	int n = i;
        	total = 0;
        	while(n > 0) {
	        	total += (n & 1);
	        	n >>= 1;
	        }
        	if(isPrime(total))
        		count++;
        }
	    
        return count;
    }
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		boolean res = true;
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		System.out.println(countPrimeSetBits(8, 8));
	}
}
