package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	List<List<Integer>> res = new ArrayList<>();
    	res = combinationSumHelper(candidates, target, 0);
    	return res;
    }

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
	
	
}
