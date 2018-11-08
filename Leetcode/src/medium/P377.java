package medium;

import java.util.Arrays;
import java.util.List;

public class P377 {
	
	/*
	 * 
	会超时
    public static int combinationSum4(int[] nums, int target) {
    	if(nums.length <= 0)
    		return 0;
    	int[] res = new int[1];
        Arrays.sort(nums);
        combinationSum4Helper(nums, target, res);
    	return res[0];
    }
   
    private static void  combinationSum4Helper(int[] nums, int target, int[] res) {
		if(target == 0) {
			res[0]++;
			return;
		}
		if(target < nums[0])
			return;
		
		for(int i = 0; i < nums.length && target >= nums[i]; i++) {
			combinationSum4Helper(nums, target-nums[i], res);
		}
	}
	
	*/


	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(combinationSum4(nums, 32));
	}
}
