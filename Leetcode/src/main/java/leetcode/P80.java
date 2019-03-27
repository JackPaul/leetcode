package leetcode;

public class P80 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 2)
        	return nums.length;
    	int res = 0;
    	boolean f = false;
    	//int num = 0;
    	if(nums[1] == nums[0]) {
    		f = true;
    		//num = nums[0];
    	}
    	
    	int len = nums.length;
        for(int i = 2; i < len; i++) {
        	if(nums[i] == nums[i-1]) {
        		if(f) {
        			for(int j = i; j < len - 1; j++) {
        				nums[j] = nums[j+1];
        			}
        			len--;
        			i--;
        		} else {
        			f = true;
        			//num = nums[0];
        		}
        	} else {
        		f = false;
        		//num = 0;
        	}
        }
        
        return len;
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
	}
}
