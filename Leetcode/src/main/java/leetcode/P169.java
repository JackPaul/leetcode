package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P169 {

    public int majorityElement(int[] nums) {
    	if(nums.length == 1)
    		return nums[0];
    	Map<Integer, Integer> map = new HashMap<>();
    	int c = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(map.containsKey(nums[i])) {
    			c =  map.get(nums[i]);
    			map.put(nums[i], c + 1);
    			if(c + 1 > nums.length / 2) {
    				return nums[i];
    			}
    		} else {
    			map.put(nums[i], 1);
    		}
    	}
    	
    	return 0;
    }

}
