package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	if(!map.containsKey(nums[i])) {
        		map.put(nums[i], i);
        	} else {
        		int index = map.get(nums[i]);
        		if(i - index <= k)
        			return true;
        		else
        			map.put(nums[i], i);
        	}
        } 
        return false;
    }
    
    public static void main(String[] args) {
		int[] aa = {1, 2, 3, 1};
		System.out.println(containsNearbyDuplicate(aa, 3));
	}
}
