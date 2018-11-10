package easy;

import java.util.List;

public class P897 {
	
	TreeNode node = null;
	TreeNode next = null;
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> res = null;
        
        inOrderTravel(root);
        next.right = null;
        return node;
    }
	private void inOrderTravel(TreeNode root) {
		if(root != null) {
			inOrderTravel(root.left);
			if(node == null) {
				node = root;
				next = node;
			} else {
				next.right = root;
				next = next.right;
				root.left = null;
			}
			inOrderTravel(root.right);
		}
		
	}
	
	/*
	
	public TreeNode increasingBST(TreeNode root) {
        return helper(root, null);
    }

    public TreeNode helper(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = helper(root.left, root);
        root.left = null;
        root.right = helper(root.right, tail);
        return res;
    }
 
    */

}
