package leetcode;

public class P198 {
	public static int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
		if(nums.length == 1)
			return nums[0];
		int[] money = new int[nums.length];
		money[0] = nums[0];
		money[1] = nums[1]>nums[0]?nums[1]:nums[0];

		for(int i = 2; i < nums.length; i++) {
			money[i] = nums[i] + money[i-2]>money[i-1]?nums[i] + money[i-2]:money[i-1];
		}
		
		return money[nums.length-1];
	}
}
