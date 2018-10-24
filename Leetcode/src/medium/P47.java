package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P47 {
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		boolean[] flag = new boolean[nums.length];
		Arrays.sort(nums);
		permute(nums, res, new ArrayList<Integer>(), flag);
		
		return res;
	}
	private static void permute(int[] nums, List<List<Integer>> res, ArrayList<Integer> curr, boolean[] flag) {
		if(curr.size() == nums.length) {
			res.add(new ArrayList<>(curr));
			return;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(i > 0 && nums[i] == nums[i-1] && flag[i-1])continue;
			if(!flag[i]) {
				curr.add(nums[i]);
				flag[i] = true;
				permute(nums, res, curr, flag);
				flag[i] = false;
				curr.remove(curr.size() - 1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(permuteUnique(nums));
	}
}
