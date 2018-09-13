package easy;


public class P897 {
    public TreeNode increasingBST(TreeNode root) {
    	//ĳ�ڵ��Һ�������������������ڵ�  ��������������������jiedian
    	if(root != null) {
    		if(root.left == null && root.right == null) {
    			return root;
    		} if(root.left == null && root.right != null) {
    			root.right = increasingBST(root.right);
    			root.left = null;
    			return root;
    		} if(root.left != null && root.right == null) {
    			TreeNode left = increasingBST(root.left);
    			TreeNode current = left;
    			while(current.right != null) {
    				current = current.right;
    			}
    			current.right = root;
    			root.left = null;
    			root.right = null;
    			return left;
    		} else {
    			TreeNode left = increasingBST(root.left);
    			TreeNode current = left;
    			while(current.right != null) {
    				current = current.right;
    			}
    			current.right = root;
    			root.right = increasingBST(root.right);
    			return left;
    		}
    	}
    	return null;
    }

}
