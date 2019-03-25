package medium;

import java.util.HashMap;
import java.util.Map;

public class P220 {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
//        	if(!map.containsKey(nums[i])) {
//        		map.put(nums[i], i);
//        	} else {
                for(int j = nums[i] - t; j <= nums[i] + t; j++) {
                    if(map.containsKey(j) && (int)(Math.abs(i - map.get(j))) <= k)
                        return true;
                }

        		map.put(nums[i], i);
        	
        } 
        return false;
    }
    
    public static void main(String[] args) {
		int[] nums = {2,1};
		System.out.println(containsNearbyAlmostDuplicate(nums, 1, 1));
	}

}
