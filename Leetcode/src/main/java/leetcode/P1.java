package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                if(target == nums[i] * 2) {
                    if(map.get(nums[i]).size() == 2) {
                        res[0] = map.get(nums[i]).get(0);
                        res[1] = map.get(nums[i]).get(1);
                        break;
                    }
                } else {
                    res[0] = i;
                    res[1] = map.get(target - nums[i]).get(0);
                    break;
                }
            }
        }
        return res;
    }
}
