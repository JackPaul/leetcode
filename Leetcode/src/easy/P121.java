package easy;

public class P121 {

    public int maxProfit(int[] prices) {
      int res = 0;
      int i = 0, j = 0;
      while(i < prices.length && j < prices.length) {
    	  if(prices[j] > prices[i]) {
    		  res = res>prices[j]-prices[i]?res:prices[j]-prices[i];
    	  } else {
    		  i = j;
    	  }
    	  j++;
      }
      return res;
    }

}
