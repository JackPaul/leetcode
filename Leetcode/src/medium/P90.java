package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> curr = new ArrayList<>();
    	Arrays.sort(nums);
    	boolean[] flag = new boolean[nums.length];
    	for(int i = 0; i <= nums.length; i++) {
    		subsetsWithDup(nums, res, flag, curr, i, 0);
    	}
    	
    	return res;
    }

	private static void subsetsWithDup(int[] nums, List<List<Integer>> res, boolean[] flag, List<Integer> curr, int i, int idx) {
		if(curr.size() == i) {
			res.add(new ArrayList<>(curr));
			return;
		}
		
		for(int j = idx; j <= nums.length - 1; j++) {
			if(j > idx && nums[j] == nums[j-1])continue;
			if(!flag[j]) {
				curr.add(nums[j]);
				flag[j] = true;
				subsetsWithDup(nums, res, flag, curr, i, j+1);
				curr.remove(curr.size()-1);
				flag[j] = false;
			}
		}	
	}
	
	public static void main(String[] args) {
		int[] nums = {2,1,2,2};
		System.out.println(subsetsWithDup(nums));
	}
}
