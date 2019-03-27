package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<>();
    	levelTravel(root, res, 0, 1);
    	return res;
    }

	private void levelTravel(TreeNode root, List<List<Integer>> res, int level, int direc) {
		if(root == null)
			return;
		if(res.size() <= level)
			res.add(new ArrayList<Integer>());
		if(direc == 1) {
			res.get(level).add(root.val);
		} else {
			res.get(level).add(0,root.val);
		}
		levelTravel(root.left, res, level + 1, (direc + 1) % 2);
		levelTravel(root.right, res, level + 1, (direc + 1) % 2);	
	}
}
