package medium;

public class P209 {
    public static int minSubArrayLen(int s, int[] nums) {
    	if(nums.length == 0)
    		return 0;
    	
    	if(nums.length == 1)
    		if(nums[0] >= s)
    			return 1;
    		else
    			return 0;
    	if(nums[0] > s)
    		return 1;
        int minLen = Integer.MAX_VALUE;
        int i = 0;
        int j = 1;
        int sum = nums[0] + nums[1];
        
        while(i <= j) {
        	if(sum >= s) {
        		if(j - i + 1 < minLen) {
        			minLen = j - i + 1;
        		}
        		sum -= nums[i];
        		i++;
        	} else {
        		j++;
        		if(j == nums.length)
        			break;
        		sum += nums[j];    		
        	}
        }
        
        if(j == nums.length && sum >= s) {
        	while(sum > s) {
            	sum -= nums[i];
            	i++;
        	}
            j--;
            i--;
            if(j - i + 1 < minLen) {
    			minLen = j - i + 1;
    		}
        }
        
        if(i > j)
        	return 1;
        
        if(i == 0 && j == nums.length && sum < s)
        	return 0;
        return minLen;
    }

    public static void main(String[] args) {

    	int[] nums = {1,4,4};
		System.out.println(minSubArrayLen(4, nums));
	}
}
