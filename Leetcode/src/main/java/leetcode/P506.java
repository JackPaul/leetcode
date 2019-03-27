package leetcode;

import java.util.Arrays;
import java.util.Comparator;


public class P506 {

    public static String[] findRelativeRanks(int[] nums) {
    	String[] res = new String[nums.length];
    	int count = 0;
    	for(int i = 0; i < nums.length; i++) {
    		count = 0;
    		for(int j = 0; j < nums.length; j++) {
    			if(nums[j] > nums[i]) {
    				count++;
    			}
    		}
    		
    		switch(count) {
    		case 0: res[i] = "Gold Medal";break;
    		case 1: res[i] = "Silver Medal";break;
    		case 2: res[i] = "Bronze Medal";break;
    		default:res[i] = count+1+"";
    		}
    	}
    	
    	return res;
    }
    
    public static void main(String[] args) {
    	int[] a = {5,4,3,2,1};
		System.out.println(findRelativeRanks(a));
	}

}
