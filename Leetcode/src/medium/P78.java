package medium;

import java.util.ArrayList;
import java.util.List;

public class P78 {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	List<Integer> l = new ArrayList<>();
    	res.add(l);
    	for(int n : nums) {
    		List<Integer> l1 = new ArrayList<>();
    		l1.add(n);
    		res.add(l1);
    	}
    	
    	
    	return res;
    }
}
