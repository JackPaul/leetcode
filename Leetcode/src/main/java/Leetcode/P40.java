package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P40 {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);

        combinationSum(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    
    private static void combinationSum(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        if(target < 0)
        	return;
        if(idx >= candidates.length)
        	return;
        curr.add(candidates[idx]);
        combinationSum(candidates, target - candidates[idx], idx+1, curr, res);
        curr.remove(curr.size() - 1);
        idx++;
        while(idx < candidates.length && candidates[idx] == candidates[idx-1])
        	idx++;
        combinationSum(candidates, target, idx, curr, res);

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
	
	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		System.out.println(combinationSum2(candidates, 8));
	}
}
