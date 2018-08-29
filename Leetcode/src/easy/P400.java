package easy;

public class P400 {

    public static int findNthDigit(int n) {
    	int m = n / 9;
    	int i = 1;
    	int count = 1;
    	while(m / i > 1) {
    		i = i * 10;
    		count++;
    	}
    	System.out.println(count);
    	System.out.println(i);
    	return 1;
    }
    
    public static void main(String[] args) {
		findNthDigit(12);
	}
}
