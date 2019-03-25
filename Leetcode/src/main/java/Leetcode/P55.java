package medium;

import java.util.ArrayList;
import java.util.List;

public class P55 {
    public static boolean canJump(int[] nums) {
    	if(nums.length <= 1)
    		return true; 
    	if(nums[0] == 0) {
    		return false;
    	}
    	//迭代  寻找每次能去的最大地方
    	int i= 0, max = 1;
    	while(i < nums.length - 1 && i <= max) {
    		int end = nums[i] + i;
    		if(end >= nums.length - 1)
    			return true;
    		if(end > max) {
    			max = end;
    		}
    		i++;
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(canJump(nums));
	}
}
