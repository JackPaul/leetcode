package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	return combinationSumHelper(candidates, target, 0);
    }

	private List<List<Integer>> combinationSumHelper(int[] candidates, int target, int i) {
		List<List<Integer>> res = new ArrayList<>();
		if(i > candidates.length - 1) {
			return res;
		}
		
		if(target < candidates[0] || target > candidates[candidates.length - 1])
			return res;
		
		int t = target - candidates[i];
		if(t == 0) {
			res.add(Arrays.asList(candidates[i]));
			return res;
		} else {
			if(combinationSumHelper(candidates, t, i).size() == 0){
				return res;
			} else {
				for()
			}
		}
		return null;
	}
}
