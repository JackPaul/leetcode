package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	Arrays.sort(nums);
    	List<List<Integer>> res = new ArrayList<>();
    	for(int i = 0; i < nums.length - 3; i++) {
    		if(i > 0 && nums[i] == nums[i-1])
    			continue;
    		for(int j = i + 1; j < nums.length - 2; j++) {
    			if(j > i + 1 && nums[j] == nums[j-1])
    				continue;
    			int t = target - nums[i] - nums[j];
    			int low = j + 1;
    			int high = nums.length - 1;
    			while(low < high) {
    				if(nums[low] + nums[high] == t) {
    					res.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
    					while(low < high && nums[low] == nums[low+1])low++;
    					while(low < high && nums[high] == nums[high-1])high--;
    					low++;
    					high--;
    				} else if(nums[low] + nums[high] < t) {
    					low++;
    				} else {
    					high--;
    				}
    			}
    		}
    	}
    	return res;
    }

    public static void main(String[] args) {
		int[] nums = {-4,-3,-2,-1,0,0,1,2,3,4};
		System.out.println(fourSum(nums, 0));
	}
}
