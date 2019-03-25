package medium;

import java.util.ArrayList;
import java.util.List;

public class P78 {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> curr = new ArrayList<>();
    	boolean[] flag = new boolean[nums.length];
    	for(int i = 0; i <= nums.length; i++) {
    		subsets(nums, res, flag, curr, i, 0);
    	}
    	
    	return res;
    }

	private void subsets(int[] nums, List<List<Integer>> res, boolean[] flag, List<Integer> curr, int i, int idx) {
		if(curr.size() == i) {
			res.add(new ArrayList<>(curr));
			return;
		}
		
		for(int j = idx; j <= nums.length - 1; j++) {
			if(!flag[j]) {
				curr.add(nums[j]);
				flag[j] = true;
				subsets(nums, res, flag, curr, i, j+1);
				curr.remove(curr.size()-1);
				flag[j] = false;
			}
		}	
	}
}
