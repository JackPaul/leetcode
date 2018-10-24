package medium;

import java.util.ArrayList;
import java.util.List;

public class P60 {

    public static String getPermutation(int n, int k) {
        String res = "";
        int[] pos = new int[n];
        int m = n;
        for(int i = 0; i < n - 1; i++) {
        	int mul = sqn(n - i - 1);
        	if(k < mul)
        		continue;
        	
        	pos[i] = k / mul;
        	if(pos[i] == 0)
        		break;
        	k = k % mul;
        	if(k == 0) {
        		pos[i]--;
        		 k = mul;
        	}      		
        	m = m - 1;
        }
        
        List<Integer> nums = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
        	nums.add(i);
        }
        
        for(int i = 0; i < n - 1; i++) {
        	res += nums.get(pos[i]);
        	nums.remove(pos[i]);
        }
        res += nums.get(0);
        return res;
    }
    
    
    public static void main(String[] args) {
		System.out.println(getPermutation(4, 13));
	}
    public static int sqn(int n) {
    	int total = 1;
    	for(int i = 2; i <= n; i++)
    		total *= i;
    	return total;
    }

}
