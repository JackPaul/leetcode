package easy;

public class P404 {

    public int sumOfLeftLeaves(TreeNode root) {
    	TreeNode pre = null;
    	return sumOfLeft(root, pre);
    }
    
    public int sumOfLeft(TreeNode root, TreeNode pre) {
    	if(root == null)
    		return 0;
    	if(root.left == null && root.right == null && pre != null && pre.left == root)
    		return root.val;
    	else
    		return sumOfLeft(root.left, root) + (root.right==null?0:sumOfLeft(root.right.left, root.right)) + (root.right==null?0:sumOfLeft(root.right.right, root.right));
    }

}
