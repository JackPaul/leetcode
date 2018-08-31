package easy;

import java.util.HashMap;
import java.util.Map;


public class P594 {

    public int findLHS(int[] nums) {
    	if(nums.length < 2)
    		return 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
        	if(map.containsKey(i)) {
        		map.put(i, map.get(i)+1);
        	} else {
        		map.put(i, 1);
        	}
        }
        	
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
        	if(map.containsKey(e.getKey()+1)) {
        		res = res > e.getValue() + map.get(e.getKey()+1)?res:e.getValue() + map.get(e.getKey()+1);
        	}
        }
       
        return res;
    }

}
