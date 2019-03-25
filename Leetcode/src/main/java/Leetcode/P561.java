package easy;

import java.util.Arrays;

public class P561 {

	 public int arrayPairSum(int[] nums) {
	      int total = 0;
	      Arrays.sort(nums);
	      for(int i = 0; i < nums.length; i += 2) {
	    	  total += nums[i];
	      }
	      return total;
	 }

}
