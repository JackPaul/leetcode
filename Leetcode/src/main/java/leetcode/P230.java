package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P230 {
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> nodes = new ArrayList<>();
        visit(root, nodes);
        return nodes.get(k-1).val;
    }

	private void visit(TreeNode root, List<TreeNode> nodes) {
		if(root != null) {
			visit(root.left, nodes);
			nodes.add(root);
			visit(root.right, nodes);
		}
		
	}
}
