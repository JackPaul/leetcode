package leetcode;

public class P122 {

    public static int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int res = 0;
        int pre = 0;
        int i = 1;
        
        while(i < prices.length) {
        	if(prices[i] < prices[i - 1]) {
        		res += prices[i-1] - prices[pre];
        		pre = i;
        	} 
        	i++;
        }
        
        res += prices[i-1] - prices[pre];
        return res;
    }
    
    public static void main(String[] args) {
    	int[] a = {7,6,4,3,1};
		System.out.println(maxProfit(a));
	}

}
