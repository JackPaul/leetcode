package leetcode;

public class P400 {

    public static int findNthDigit(int n) {
    	int res = 0;
    	
    	int  i = 1;
    	long k = 1;
    	
    	long total = 0;
    	while(n > total) {
    		total += i * 9 * k;
    		i++;
    		k *= 10;
    	}
    	
    	i -= 1;
    	k /= 10;
    	total = total - i * 9 * k;
    	int num = (int) ((k - 1) + (n - total) / i);
    	//System.out.println(total);
    	if((n - total) % i != 0) {
    		num ++;
    		return (num + "").charAt((int) ((n - total) % i - 1)) - '0';
    	} else {
    		return ((num + "").charAt(i-1)) - '0';
    	}
    }
    
    public static void main(String[] args) {
		System.out.println(findNthDigit(1000000000));
	}
}
