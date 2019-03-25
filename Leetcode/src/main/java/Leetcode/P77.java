package medium;

import java.util.ArrayList;
import java.util.List;

public class P77 {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> res = new ArrayList<>();
    	combine(n, 1, k, res, new ArrayList<Integer>());
    	return res;
    }

	private void combine(int n, int idx, int k, List<List<Integer>> res, ArrayList<Integer> curr) {
		if(curr.size() == k) {
			res.add(new ArrayList<>(curr));
		} else {
			curr.add(idx);
			for(int i = idx + 1; i <= n; i++)
			{
				combine(n, idx+1, k, res, curr);
			}
			curr.remove(curr.size()-1);
		}

	}
}
