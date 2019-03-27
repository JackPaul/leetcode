package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> level = new ArrayList<>();
        rightSideViewHelper(root, level, 0);
        for(List<Integer> list : level) {
        	res.add(list.get(list.size()-1));
        }
        return res;
    }

	private void rightSideViewHelper(TreeNode root, List<List<Integer>> level, int i) {
		if(root == null)
			return;
		if(level.size() <= i)
			level.add(new ArrayList<Integer>());
		level.get(i).add(root.val);
		rightSideViewHelper(root.left, level, i+1);
		rightSideViewHelper(root.right, level, i+1);
	}

}
