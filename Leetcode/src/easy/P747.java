package easy;

public class P747 {
    public int dominantIndex(int[] nums) {
    	if(nums.length < 2)
    		return nums.length - 1;
        int max = nums[0];
        int res = 0;
        for(int i = 1; i < nums.length; i++) {
        	if(max < nums[i]) {
        		max = nums[i];
        		res = i;
        	}
        }
        
        boolean duplicated = false;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == max) {
        		if(!duplicated)
        			duplicated = true;
        		else
        			return -1;
        	} else {
        		if(2 * nums[i] > max)
        			return -1;
        	}
        }
        
        return res;
    }
}
