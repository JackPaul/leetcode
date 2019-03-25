package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P39 {
	/*网友解法
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        
        combinationSum(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    
    private void combinationSum(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i = idx; i < candidates.length; i++) {
            if (candidates[i] > target) {
                return;
            }
            curr.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
	 */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	return combinationSumHelper(candidates, target);
    }

	private static List<List<Integer>> combinationSumHelper(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if(target < candidates[0])
			return res;
		for(int i = 0; i < candidates.length; i++) {
			int t1 = target - candidates[i];
			if(t1 >= candidates[i]) {
				List<List<Integer>> c1 = combinationSumHelper(candidates, t1);
				if(c1.size() > 0) {
					for(List<Integer> l : c1) {
						if(l.get(0) >= candidates[i]) {
							l.add(0, candidates[i]);
							res.add(l);
						}

					}
				}
			}
			if(t1 == 0) {
				List<Integer> l1 = new ArrayList<>();
				l1.add(candidates[i]);
				res.add(l1);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] candidates = {2,3,5};
		System.out.println(combinationSum(candidates, 8));
	}

    /*
	private List<List<Integer>> combinationSumHelper(int[] candidates, int target, int i) {
		List<List<Integer>> res = new ArrayList<>();
		if(i > candidates.length - 1) {
			return res;
			//Arrays.binarys
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
				;
			}
		}
		return null;
	}
	*/
}
