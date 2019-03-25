package medium;

public class P41 {
    public static int firstMissingPositive(int[] nums) {
        if(nums.length == 0)
        	return 1;
    	boolean hasMaxLen = false;
        int i = 0;
        while(i < nums.length) {
        	if(nums[i] <= 0) {
        		i++;
        	} else {
        		if(nums[i] < nums.length) {
        			if(nums[i] != i) {
            			int m = nums[i];
            			if(nums[m] != m) {
                			nums[i] = nums[m];
                			nums[m] = m;
            			} else {
            				i++;
            			}

        			} else {
        				i++;
        			}
        		} else if(nums[i] == nums.length) {
        			hasMaxLen = true;
        			nums[i] = -1;
        			i++;
        		} else {
        			i++;
        		}
        	}
        }
        
        for(i = 1; i < nums.length; i++) {
        	if(nums[i] != i)
        		return i;
        }
        
        if(i == nums.length && hasMaxLen)
        	return nums.length + 1;
        else
        	return nums.length;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,1};
		System.out.println(firstMissingPositive(nums));
	}
}
