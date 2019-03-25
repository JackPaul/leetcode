package medium;

import java.util.Arrays;

public class P16 {
    public static int threeSumClosest(int[] nums, int target) {

    	Arrays.sort(nums);
    	int d = Integer.MAX_VALUE;
    	int sum = 0;
    	for(int i = 0; i < nums.length - 2; i++) {
    		if(i > 0 && nums[i] == nums[i - 1]) {
    			continue;
    		}
    		
    		int low = i + 1;
    		int high = nums.length - 1;
    		int t = target - nums[i];
    		while(low < high) {
    			if(nums[low] + nums[high] == t)
    				return target;
    			else if(nums[low] + nums[high] < t) {
    				if(d > t - nums[low] - nums[high]) {
    					d = t - nums[low] - nums[high];
    					sum = nums[i] + nums[low] + nums[high];
    				}
    				low++;
    			}else {
    				if(d > nums[low] + nums[high] - t) {
    					d = nums[low] + nums[high] - t;
    					sum = nums[i] + nums[low] + nums[high];
    				}
    				high--;
    			}
    		}
    	}
    	return sum;
        
    }
    
    public static void main(String[] args) {
		int[] nums = {0,2,1,-3};
		System.out.println(threeSumClosest(nums, 1));
	}
}
