package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P637 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> res = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int level = 0;
		averageLevel(root, 0, res, map);
		return res;
    }
	
	public static void averageLevel(TreeNode root, int level, List<Double> res, Map<Integer, Integer> map) {
		if(root != null) {
			if(level + 1 > res.size()) {
				res.add(root.val+0.0);
				map.put(level, 1);
			} else {
				Double total = res.get(level);
				Integer numNode = map.get(level);
				res.set(level, (total*numNode+root.val)/(numNode+1));
				map.put(level, numNode+1);
			}
			averageLevel(root.left, level+1, res, map);
			averageLevel(root.right, level+1, res, map);
		}
	}
	
	public static void main(String[] args) {
		List<Double> res = new ArrayList<>();
		//System.out.println(res.get(1));
	}
}
