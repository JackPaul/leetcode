package leetcode;

public class P338 {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        
        int count = 0;
        int n = 0;
        for(int i = 0; i <= num; i++) {
        	count = 0;
        	n = i;
        	while(n != 0) {
        		count += (n % 2);
        		n /= 2;
        	}
        	res[i] = count;
        }
        
        return res;
    }
}
