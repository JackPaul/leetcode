package easy;

public class P724 {
    public int pivotIndex(int[] nums) {
        int res = -1;
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
        	total += nums[i];
        }
        
        int total2 = 0;
        for(int i = 0; i < nums.length; i++) {
        	total2 += nums[i];
        	if((total2 - nums[i]) * 2 == total - nums[i])
        		return i;
        }
        
        return res;
    }
}
