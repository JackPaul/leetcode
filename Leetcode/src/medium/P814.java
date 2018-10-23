package medium;

public class P814 {
	/*
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
        	return root;
        if(root.left == null && root.right == null)
        	return root;
        else if(root.left != null && root.right != null) {
        	if(root.left.val == 0) {
        		if(root.left.left == null && root.left.right == null) {
        			root.left = null;
        		} else {
        			pruneTree(root.left);
        		}
        	}
        	pruneTree(root.left);
        	
        	if(root.right.val == 0) {
        		if(root.right.left == null && root.right.right == null) {
        			root.right = null;
        		}
        		else {
        			pruneTree(root.right);
        		}
        	}
        	pruneTree(root.right);
        	
        } else if(root.left != null) {
        	if(root.left.val == 0) {
        		if(root.left.left == null && root.left.right == null) {
        			root.left = null;
        		} else {
        			pruneTree(root.left);
        		}
        	}
        	pruneTree(root.left);
        } else if(root.right != null) {
        	if(root.right.val == 0) {
        		if(root.right.left == null && root.right.right == null) {
        			root.right = null;
        		}
        		else {
        			pruneTree(root.right);
        		}
        	}
        	pruneTree(root.right);
        }
    	return root;
    }
    */
	public TreeNode pruneTree(TreeNode root) {
		if(root == null)
			return null;
		if(root.left == null && root.right == null)
			return root;
		root.left = pruneTreeHelper(root.left);
		root.right = pruneTreeHelper(root.right);
		return root;
	}
	public TreeNode pruneTreeHelper(TreeNode root) {
		if(root == null)
			return null;
		root.left = pruneTreeHelper(root.left);
		root.right = pruneTreeHelper(root.right);
	    if(root.left == null && root.right == null) {
	    	if(root.val == 0)
	        	return null;
	        else
	        	return root;
	    }
	    return root;
	}
}
