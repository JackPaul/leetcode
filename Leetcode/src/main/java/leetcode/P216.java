package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        int[] num = {1,2,3,4,5,6,7,8,9};
        combinationSum3Helper(num, res, new ArrayList<>(), 0, k, n);
        return res;
    }


	private static void combinationSum3Helper(int[] num, List<List<Integer>> res, ArrayList<Integer> cur, int i, int k, int n) {
		
		if(n == 0 && k == cur.size()) {
			res.add(new ArrayList<Integer>(cur));
			return;
		}
			
		if(i >= 9)
			return ;
		if(n < num[i])
			return;
		
		for(int j = i; j < 9; j++) {
			cur.add(num[j]);
			combinationSum3Helper(num, res, cur, j+1, k, n-num[j]);
			cur.remove(cur.size()-1);
		}
			
	}
	
	public static void main(String[] args) {
		System.out.println(combinationSum3(3, 9));
	}
}
