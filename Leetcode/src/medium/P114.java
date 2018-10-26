package medium;

import java.util.ArrayList;
import java.util.List;

public class P114 {
    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        preOrder(root, nodes);
        if(nodes.size() <= 1)
        	return;
        for(int i = nodes.size()-2; i >= 0; i--) {
        	nodes.get(i).right = nodes.get(i+1);
        }
        
    }

	private void preOrder(TreeNode root, List<TreeNode> nodes) {
		if(root != null) {
			nodes.add(root);
			TreeNode left = root.left;
			root.left = null;
			TreeNode right = root.right;
			root.right = null;
			preOrder(left, nodes);
			preOrder(right, nodes);
		}
	}
}
