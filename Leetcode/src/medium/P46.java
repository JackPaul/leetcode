package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P46 {
    public static List<List<Integer>> permute(int[] nums) {
    	
    	List<List<Integer>> res = new ArrayList<>();
    	List<List<Integer>> current = new ArrayList<>();
    	if(nums.length == 0)
    		return res;
    	current.add(Arrays.asList(nums[0]));
    	copy2(res, current);
    	for(int i = 1; i < nums.length; i++) {
    		res.clear();
    		int j = nums[i];
    		for(List<Integer> l : current) {
    			for(int k = l.size(); k > 0; k--) {
    				List<Integer> l1 = new ArrayList<>();
    				copy(l1, l);
    				l1.add(k, j);
    				res.add(l1);
    			}
    		}
    		
    		for(List<Integer> l : current) {
    			List<Integer> l1 = new ArrayList<>();
    			copy(l1, l);
    			l1.add(0, j);
    			res.add(l1);
    		}
    		
    		copy2(current, res);
    	}
    	return res;
    }
    
    private static void copy2(List<List<Integer>> current, List<List<Integer>> res) {
		current.clear();
		for(int i = 0; i < res.size(); i++) {
			List<Integer> l = new ArrayList<>();
			copy(l, res.get(i));
			current.add(l);
		}
		
	}

	private static void copy(List<Integer> l1, List<Integer> l) {
		l1.clear();
		for(int i = 0; i < l.size(); i++) {
			l1.add(l.get(i)+0);
		}
	}

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(permute(nums));
	}

}
