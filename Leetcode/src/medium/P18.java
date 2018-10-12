package medium;

import java.util.ArrayList;
import java.util.List;

public class P18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> res = new ArrayList<>();
    	
    	helper(nums, 0, target, res);
    	
    	return res;
    }

	private void helper(int[] nums, int start, int target, List<List<Integer>> res) {
		
		
	}
}
