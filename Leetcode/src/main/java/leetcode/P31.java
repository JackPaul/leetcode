package leetcode;

import java.util.Arrays;

public class P31 {
    public static void nextPermutation(int[] nums) {
    	boolean flag = false;
        for(int i = nums.length - 2; i >= 0; i--) {
        	int b = Integer.MAX_VALUE;
        	int j;
        	int pos=0;
        	for(j = i + 1; j < nums.length; j++) {
        		if(nums[j] > nums[i]) {
        			if(nums[j] < b) {
        				b = nums[j];
        				flag = true;
        				pos=j;
        			}
        		}
        	}
        	if(flag) {
            	int c = nums[i];
            	nums[i] = nums[pos];
            	nums[pos] = c;
            	//Arrays.sort(nums, i+1, nums.length);
            	break;
        	}
        }
        
        if(!flag)
        	Arrays.sort(nums);
    }
    
    public static void main(String[] args) {
		int[] nums = {1,3,2};
		nextPermutation(nums);
		System.out.println(nums);
	}
}
