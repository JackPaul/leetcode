package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        if(nums1.length > nums2.length) {
        	for(int i : nums1) {
        		if(map.containsKey(i)) {
        			map.put(i, map.get(i)+1);
        		} else {
        			map.put(i, 1);
        		}
        		
        	}
        	
        	for(int k : nums2) {
        		if(map.containsKey(k)) {
        			res.add(k);
        			if(map.get(k) == 1) {
        				map.remove(k);
        			} else {
        				map.put(k, map.get(k) - 1);
        			}
        			
        		}
        	}
        } else {
        	for(int i : nums2) {
        		if(map.containsKey(i)) {
        			map.put(i, map.get(i)+1);
        		} else {
        			map.put(i, 1);
        		}
        		
        	}
        	
        	for(int k : nums1) {
        		if(map.containsKey(k)) {
        			res.add(k);
        			if(map.get(k) == 1) {
        				map.remove(k);
        			} else {
        				map.put(k, map.get(k) - 1);
        			}
        			
        		}
        	}
        }
        
        int[] r = new int[res.size()];
        int i = 0;
        for(Integer l : res) {
        	r[i++] = l;
        }
        return r;
    }

}
