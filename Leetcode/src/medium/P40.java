package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	List<List<Integer>> res = new ArrayList<>();
    	combinationSumHelper(candidates, 0, target, new ArrayList<Integer>(), res);
    	return res;
    }

	private void combinationSumHelper(int[] candidates, int i, int target, ArrayList<Integer> curr,
			List<List<Integer>> res) {
		if(i > candidates.length)
			return;
		curr.add(candidates[0]);
		if(candidates[i] == target) {
			res.add(new ArrayList<>(curr));
		} else {
			if(target - candidates[i] >= i) {
				if(i > 0 && candidates[i] == candidates[i-1])
					combinationSumHelper(candidates, i+2, target, curr, res);
				else {
					combinationSumHelper(candidates, i+1, target, curr, res);
				}
			}
		}
		curr.remove(curr.size() - 1);
	}



    /*
    private static List<List<Integer>> combinationSumHelper(int[] candidates, int target, int idx) {
		List<List<Integer>> res = new ArrayList<>();
		if(target < candidates[idx])
			return res;
		for(int i = idx; i < candidates.length; i++) {
			int t1 = target - candidates[i];
			if(t1 == 0) {
				List<Integer> l1 = new ArrayList<>();
				l1.add(candidates[i]);
				res.add(l1);
				break;
			}
			if(i < candidates.length - 1 && t1 >= candidates[i +1]) {
				List<List<Integer>> c1 = combinationSumHelper(candidates, t1, idx+1);
				if(c1.size() > 0) {
					for(List<Integer> l : c1) {
						if(l.get(0) >= candidates[i]) {
							l.add(0, candidates[i]);
							res.add(l);
						}

					}
				}
			}

		}
		return res;
	}
	*/
	
	
}
