package easy;

public class P235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || !(isAncestor(root, p) && isAncestor(root, q)))
        	return null;
        
        boolean f1 = isAncestor(root.left, p);
        boolean f2 = isAncestor(root.right, q);
        boolean f3 = isAncestor(root.left, p);
        boolean f4 = isAncestor(root.right, q);
        if(f1 &&f2) {
        	return lowestCommonAncestor(root.left, p, q);
        } else if(f3 && f4) {
        	return lowestCommonAncestor(root.right, p, q);
        } else {
        	return root;
        }
    }
    
    public boolean isAncestor(TreeNode root, TreeNode p) {
    	if(root == null)
    		return false;
    	if(root == p)
    		return true;
    	return isAncestor(root.left, p) || isAncestor(root.right, p);
    }

}
