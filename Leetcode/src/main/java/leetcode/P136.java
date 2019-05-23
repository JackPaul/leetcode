package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P136 {

	/*
	public int singleNumber(int[] nums) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i <= nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		return -1;
    }
   */

	public int singleNumber(int[] nums) {
		int res = nums[0];
		for(int i = 1; i < nums.length; i++) {
			res ^= nums[i];
		}
		return res;
	}

}
