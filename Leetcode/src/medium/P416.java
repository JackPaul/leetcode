package medium;

import java.util.Arrays;
import java.util.HashMap;

public class P416 {

    public static boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        //找到和为nums和一半的即为true
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        if(total % 2 == 1)
            return false;
        int sum = total;
        int target = total >> 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > target)
            	return false;
        }
        boolean[] flag = new boolean[nums.length];
        return helper(nums, 0, flag, target);
        
    }
    public static boolean helper(int[] nums, int idx, boolean[] flag, int target) {
        if(target == 0)
            return true;
        if(idx < 0 || idx >= nums.length || target < nums[idx] || flag[idx])
            return false;
        

        for(int i = idx; i < nums.length; i++) {
            target -= nums[i];
            flag[i] = true;
            if(helper(nums, i+1, flag, target))
                return true;
            target += nums[i];
            flag[i] = false;  
        }
        return false;  
    }
    
    public static void main(String[] args) {
		int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100};
		System.out.println(canPartition(nums));
		
	}

}
