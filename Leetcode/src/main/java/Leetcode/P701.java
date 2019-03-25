package medium;

public class P701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root.left == null && root.right == null) {
        	if(root.val > val) 
        		root.left = new TreeNode(val);
        	else
        		root.right = new TreeNode(val);
        } else if(root.left != null && root.right == null) {
        	if(root.val > val) 
        		root.left = insertIntoBST(root.left, val);
        	else
        		root.right = new TreeNode(val);
        } else if(root.left == null && root.right != null) {
        	if(root.val > val) 
        		root.left = new TreeNode(val);
        	else
        		root.right = insertIntoBST(root.right, val);
        } else {
        	if(root.val > val)
        		root.left = insertIntoBST(root.left, val);
        	else
        		root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
