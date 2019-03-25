package medium;

public class P213 {
    public static int rob(int[] nums) {
    	if(nums.length == 0)
    		return 0;
    	if(nums.length == 1)
    		return nums[0];
    	if(nums.length == 2) {
    		return nums[0]>nums[1]?nums[0]:nums[1];
    	}
    	
        int[] money = new int[nums.length];
        money[0] = nums[0];
        money[1] = nums[0]>nums[1]?nums[0]:nums[1];
        for(int i = 2; i < nums.length - 1; i++) {
        	money[i] = nums[i] + money[i-2]>money[i-1]?nums[i] + money[i-2]:money[i-1];
        }
        
        int[] money1 = new int[nums.length];
        money1[0] = 0;
        money1[1] = nums[1];
        for(int i = 2; i < nums.length; i++) {
        	money1[i] = nums[i] + money1[i-2]>money1[i-1]?nums[i] + money1[i-2]:money1[i-1];
        }
        
        return money[nums.length-2]>money1[nums.length-1]?money[nums.length-2]:money1[nums.length-1];
        
    }
    
    public static void main(String[] args) {
		int[] nums = {1,1,1,2};
		System.out.println(rob(nums));
	}
}
