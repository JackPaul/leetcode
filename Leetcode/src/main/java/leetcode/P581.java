package leetcode;

import java.util.Arrays;

public class P581 {
    public static int findUnsortedSubarray(int[] nums) {
        int res = 0;
        
        int[] a= Arrays.copyOfRange(nums, 0, nums.length);
        
        Arrays.sort(a);
        
        int i = 0;
        while(i < nums.length) {
        	if(nums[i] == a[i]) {
        		res++;
        		i++;
        	}else
        		break;
        }
        
        int j = nums.length - 1;
        while(j > i ) {
        	if(nums[j] == a[j]) {
        		res++;
        		j--;
        	}else
        		break;
        }
        	
        return nums.length - res;
    }
    
    public static void main(String[] args) {
    	int[] a = {2,6,4,8,10,9,15};
		System.out.println(findUnsortedSubarray(a));
	}
}
