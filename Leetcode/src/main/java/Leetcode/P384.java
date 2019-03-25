package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P384 {
	class Solution {
		int[] nums = null;
		List<Integer> index = null;
		int[] originNums = null;
	    public Solution(int[] nums) {
	        this.nums = nums;
	        originNums  = new int[nums.length];
	        this.index = new ArrayList<>();
	        for(int i = 0; i < nums.length; i++) {
	        	this.index.add(i);
	        	originNums[i] = nums[i];
	        }
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        return originNums;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	        Collections.shuffle(index);
	        for(int i = 0; i < this.nums.length; i++) {
	        	int c = nums[i];
	        	nums[i] = nums[index.get(i)];
	        	nums[index.get(i)] = c;
	        }
	        return this.nums;
	    }
	}
}
