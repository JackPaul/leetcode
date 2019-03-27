package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class P51 {

    public static List<List<String>> solveNQueens(int n) {
    	//代表n行皇后 出于不同的行
    	List<List<String>> res = new ArrayList<>();
        int[] cols = new int[n];
        for(int i = 0; i < n; i++)
        	cols[i] = i;
        //边回溯边判断  不用存储cols
        boolean[] flag = new boolean[n];
        helper(cols, res, flag, new ArrayList<Integer>());
		return res;
    }

	private static void helper(int[] cols, List<List<String>> res, boolean[] flag, ArrayList<Integer> cur) {
		if(cur.size() == cols.length) {
			if(valid(cur)) {
				res.add(listToResult(cur));
			}
			return;
		}
		
		for(int i = 0; i < cols.length; i++) {
			if(!flag[i]) {
				cur.add(cols[i]);
				flag[i] = true;
				helper(cols, res, flag, cur);
				cur.remove(cur.size()-1);
				flag[i] = false;
			}
		}			
	}

	private static List<String> listToResult(List<Integer> cur) {
		List<String> res = new ArrayList<>();
		int j = 0;
		int q = 0;
		for(int i = 0; i < cur.size(); i++) {
			StringBuffer sb = new StringBuffer();
			q = cur.get(i);
			for(j = 0; j < q; j++) {
				sb.append('.');
			}
			if(q < cur.size())
				sb.append('Q');
			for(j = q + 1; j < cur.size(); j++) {
				sb.append('.');
			}
			res.add(sb.toString());
		}
		return res;
	}

	private static boolean valid(ArrayList<Integer> cur) {
		for(int i = 0; i < cur.size() - 1; i++) {
			for(int j = i + 1; j < cur.size(); j++) {
				if(Math.abs(i-j) == Math.abs(cur.get(i) - cur.get(j)))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(solveNQueens(4));
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > 02)
					return -1;
				else if(o1 == o2)
					return 0;
				else
					return 1;
			}
			
		});
	}
}
