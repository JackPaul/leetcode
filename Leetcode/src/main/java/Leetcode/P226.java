package easy;

public class P226 {

	  class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	  }


	    public TreeNode invertTree(TreeNode root) {
	        if(root != null) {
	        	invertTree(root.left);
	        	invertTree(root.right);
	        	TreeNode node = root.left;
	        	root.left = root.right;
	        	root.right = node;
	        	return root;
	        } else {
	        	return null;
	        }
	    }


}
