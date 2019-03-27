package leetcode;

public class P110 {

    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
        return Math.abs(depth(root.left, 1) - depth(root.right, 1)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int depth(TreeNode root, int degree) {
    	if(root == null) {
    		return degree;
    	} return Math.max(depth(root.left, degree+1), depth(root.right, degree+1));
    	
    }
    
    
}
