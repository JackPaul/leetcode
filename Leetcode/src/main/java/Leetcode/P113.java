package medium;

import java.util.ArrayList;
import java.util.List;

public class P113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> res = new ArrayList<>();
    	pathSum(root, sum, res, new ArrayList<Integer>());
    	return res;
    }

	private void pathSum(TreeNode root, int sum, List<List<Integer>> res, ArrayList<Integer> curr) {
		if(root == null)
			return;
		curr.add(root.val);
		if(root.val == sum && root.left == null && root.right == null) {
			res.add(new ArrayList<>(curr));
		} 
		pathSum(root.left, sum - root.val, res, curr);
		pathSum(root.right, sum - root.val, res, curr);
		curr.remove(curr.size()-1);
	}

}
