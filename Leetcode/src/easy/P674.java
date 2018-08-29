package easy;

public class P674 {

    public int findLengthOfLCIS(int[] nums) {
    	if(nums.length == 0)
    		return 0;
        int res = 0;
        int i = 0, j = 1;
        while(j < nums.length) {
        	if(nums[j] > nums[j - 1]) {
        		;
        	} else {
        		res = res > j - i?res:j - i;
        		i = j;
        	}
        	j++;
        }
        res = res > j - i?res:j - i;
        return res;
    }

}
